/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2transacciones.test;

import java.sql.Connection;
import java.sql.SQLException;

import java.util.List;
import tema2transacciones.datos.PersonasJDBC;
import tema2transacciones.domain.Persona;
import tema2transacciones.datos.Conexion;

/**
 *
 * @author pablo
 */
public class Test {

    public static void main(String[] args) {
        //Creamos un objeto conexion, se va a compartir
        //para todos los queries que ejecutemos
        Connection conn = null;

        try {
            conn = Conexion.getConnection();
            //Revisamos si la conexion esta en modo autocommit
            //por default es autocommit == true

            if (conn.getAutoCommit()) {
                //desactivamos para que nosotros controlemos las transacciones
                //es decir si todas las transacciones son correctas mandar un tru y sino
                //un rollback
                conn.setAutoCommit(false);
            }
            //Creamos el objeto PersonasJDBC
            //proporcionamos la conexion creada
            //para que se mnatenga viva la conexion en todo el objeto hasta que se terminen las transacciones
            PersonasJDBC personas = new PersonasJDBC(conn);
            personas.update(2, "regreso2", "regresp");

            //empezamos a ejecutar sentencias
            //recordar que una transaccion agrupa varias
            //sentencias SQL
            //si algo falla en alguna de las transacciones no se realizan los cambios en
            //la BD
            //cambio correcto
            personas.update(2, "Regreso2", "Regreso");
            //Provocamos un error superando los 45 caracteres
            //del campo de apellido
            personas.insert("Miguel2",
                  //  "Ayala12341234123412341234123412341234123412341234123412341234123412341234123412341234iiiiiiiiiiiiiiiiiiiiiiiiiuuuuuuuuuuu");
            "Ayala2");
            //guardamos los cambios
            conn.commit();

        } catch (SQLException e) {
                 //Hacemos rollback en caso de error
            try {
                System.out.println("Entramos al rollback");
               //Imprimimos la excepcion a la consola
                e.printStackTrace(System.out);
                //Hacemos rollback
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace(System.out);
            }

        }

    }
}
