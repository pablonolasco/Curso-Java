/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2transacciones.datos;

import tema1introduccionJdbc.ejericio.datos.*;
import java.sql.*;
import java.util.*;
import tema1introduccionJdbc.ejericio.domain.Persona;

/**
 *
 * @author pablo
 */
public class PersonasJDBC {
    //Nos apoyamos de la llave primaria autoincrementable de MySql
    //por lo que se omite el campo de persona_id
    //Se utiliza un prepareStatement, por lo que podemos
    //utilizar parametros (signos de ?)
    //los cuales posteriormente será sustituidos por el parametro respectivo

    private final String SQL_INSERT = "insert into persona (nombre, apellido) values (?,?)";
    private final String SQL_UPDATE = "update persona set nombre=?, apellido=? where id_persona=?";
    private final String SQL_DELETE = "delete from persona where id_persona=? ";
    private final String SQL_SELECT = "select id_persona, nombre, apellido from persona";
    private Connection connection;
    private PreparedStatement stmt;
    private ResultSet res;

    public PersonasJDBC(Connection connection) {
        this.connection = connection;
    }

    public PersonasJDBC() {
    }

    public int insert(String nombre, String apellido) throws SQLException {
        Connection conn = null;
        //se debe omitir el bloque cach para que se propague una excepcion, solo se coloca el throws
        int rows = 0;//registros afectados
        try {

            //comprobar si la variable conexion ya fue inicilizada, si manda false generamos una nueva
            conn = (this.connection != null) ? this.connection : Conexion.getConnection();
            stmt = connection.prepareStatement(SQL_INSERT);
            int indice = 1;
            this.stmt.setString(indice++, nombre);
            this.stmt.setString(indice++, apellido);
            System.out.println("Ejecutando Query" + this.SQL_INSERT);
            rows = this.stmt.executeUpdate();
            System.out.println("Registros afectados" + rows);
        } finally {
            Conexion.close(stmt);
            //se hace para mantener abierta la conexxion
            if (this.connection == null) {

                Conexion.close(conn);
            }
        }
        return rows;
    }

    public int update(int id_persona, String nombre, String apellido) throws SQLException {
        Connection conn = null;
        int rows = 0;
        try {
            //comprobar si la variable conexion ya fue inicilizada, si manda false generamos una nueva
            conn = (this.connection != null) ? this.connection : Conexion.getConnection();
            this.stmt = connection.prepareStatement(SQL_UPDATE);
            int indice = 1;
            this.stmt.setString(indice++, nombre);
            this.stmt.setString(indice++, apellido);
            this.stmt.setInt(indice, id_persona);
            System.out.println("Ejecutando sentencia " + this.SQL_UPDATE);
            this.stmt.executeUpdate();
            System.out.println("Registros actualizados " + rows);

        } finally {
            Conexion.close(stmt);
            //se hace para mantener abierta la conexxion
            if (this.connection == null) {

                Conexion.close(conn);
            }
        }

        return rows;
    }

    public int eliminar(int id_persona) throws SQLException {
        Connection conn = null;
        int rows = 0;
        try {
            //comprobar si la variable conexion ya fue inicilizada, si manda false generamos una nueva
            conn = (this.connection != null) ? this.connection : Conexion.getConnection();
            this.stmt = connection.prepareStatement(SQL_DELETE);
            this.stmt.setInt(1, id_persona);
            rows = this.stmt.executeUpdate();
            System.out.println("Registros eliminados " + rows);
        } finally {
            Conexion.close(stmt);
            //se hace para mantener abierta la conexxion
            if (this.connection == null) {

                Conexion.close(conn);
            }
        }
        return rows;

    }

    public List<Persona> listar() throws SQLException {
        Connection conn = null;
        List<Persona> listPersonas = new ArrayList<>();
        try {
            //comprobar si la variable conexion ya fue inicilizada, si manda false generamos una nueva
            conn = (this.connection != null) ? this.connection : Conexion.getConnection();
            this.stmt = connection.prepareStatement(SQL_SELECT);
            this.res = stmt.executeQuery();

            while (res.next()) {
                Persona persona = new Persona();
                persona.setId_persona(res.getInt(1));
                persona.setNombre(res.getString(2));
                persona.setApellido(res.getString(3));
                listPersonas.add(persona);

            }

        } finally {
           
            Conexion.close(res);
            Conexion.close(stmt);
            //se hace para mantener abierta la conexxion
            if (this.connection == null) {

                Conexion.close(conn);
            }
        }

        return listPersonas;
    }

}
