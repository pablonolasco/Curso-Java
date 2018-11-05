/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1introduccionJdbc;
import java.sql.*;
/**
 *
 * @author pablo
 */
public class IntroduccionJDB {
    /**
     * 
     * 
     *El método de executeQuery se utiliza para ejecutar sentencias de tipo select y por
        ello el método regresa un objeto ResultSet, el cual almacena el resultado en forma
        de una matriz de dos dimensiones, es decir, en renglones y columnas, así podemos
        procesar el resultado del query sin ningún problema.
     *El método executeUpdate se utiliza para ejecutar sentencias DML (Data
        Manipulation Language) como son las sentencias insert, update y delete. También
        nos va a permitir ejecutar sentencias de tipo DDL (Data Definition Language) como
        son las sentencias create table, truncate table, entre otras. La función
        executeUpdate regresa un entero, indicando el número de registros afectados como
        resultado de ejecutar el query deseado.
      *Por último, el método de execute nos sirve para ejecutar cualquier tipo de
        sentencia SQL. Este método regresa un valor boleano, el cual regresa true si el
        resultado es un ResulSet, esto es, si se ejecutó un select, y regresa false si se
        ejecutó alguna otra sentencia, como insert, update, delete, o alguna otra
     */
    public static void main(String[] args) {
        //Cadena de conexion de MYSQL, useSSL es opcional pero tiene que ir sino marca error
        String url="jdbc:mysql://localhost:3306/sga?useSSL=false";
        try {
            //Cargar el driver
            Class.forName("com.mysql.jdbc.Driver");
            //Creamos el objeto conexion
            Connection connection= (Connection)DriverManager.getConnection(url,"root","");
            //Creamos objeto Statement
            Statement instruccion= connection.createStatement();
            String sql="select id_persona,nombre, apellido from persona";
            //Ejecutar sentencia
           
            
            ResultSet resultSet= instruccion.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println("Id:"+resultSet.getInt(1)); 
                System.out.println("Nombre:"+resultSet.getString(2)); 
                System.out.println("Apelldio:"+resultSet.getString(3));
                System.out.println("");
            }
            
            instruccion.close();
            resultSet.close();
            connection.close();
            
        }catch(ClassNotFoundException | SQLException e){
            System.err.println("Error de carga driver");
            e.printStackTrace();
        }catch (Exception e) {
            System.err.println("Ocurrio un error");
            e.printStackTrace();
        }
        
    }
}
