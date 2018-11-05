/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4storeprocedureoracle;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.*;

/**
 *
 * @author pablo
 */
public class Test {
    public static void main(String[] args) {
        try {
            final int ID_EMPLEADO=100;
            Connection connection= Conexion.getConnection();
            CallableStatement ctmt=null;            
            double salarioMensual=0.0d;
            //Mandar a llamar funcion
            //? variable para almacenar el resultado de la funcion
            //(?) parametroa a enviar para funcion
            ctmt=connection.prepareCall("({? = call get_employee_salary(?)})");
            //Una funcion regresa un valor
            //Por lo que lo registramos como el parametro 1
            ctmt.registerOutParameter(1, java.sql.Types.INTEGER);
            //Registramos el segundo parametro
            ctmt.setInt(2, ID_EMPLEADO);
            ctmt.execute();
            salarioMensual=ctmt.getDouble(1);
            ctmt.close();
            System.out.println("Empleado:"+ID_EMPLEADO);
            System.out.println("Salario:"+salarioMensual);
            
        } catch (Exception e) {
            System.err.println("Error:");
            e.printStackTrace();
        }
    }
    
}
