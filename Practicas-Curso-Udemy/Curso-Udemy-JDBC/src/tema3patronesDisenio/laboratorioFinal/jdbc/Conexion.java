/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3patronesDisenio.laboratorioFinal.jdbc;
import java.sql.*;
/**
 *
 * @author pablo
 */
public class Conexion {
    private static final String DRIVER="com.mysql.jdbc.Driver";
    private static final String URL="jdbc:mysql://localhost/sga?useSSL=false";
    private static final String PASSWORD="";
    private static final String USUARIO="root";
    private static Driver driver;
    public  static synchronized Connection getConnection()throws SQLException{
        if(driver == null){
            try {
                Class jdbc=Class.forName(DRIVER);
                driver=(Driver)jdbc.newInstance();
                DriverManager.registerDriver(driver);
            } catch (Exception e) {
                System.err.println("Error Conexion");
                e.printStackTrace();
            }
        }
        return DriverManager.getConnection(URL,USUARIO,PASSWORD);
    }
    
    public static void close(ResultSet resultSet){
        try {
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (Exception e) {
            System.err.println("Result");
            e.printStackTrace();
        }
        
    }
    
    public static void close(PreparedStatement preparedStatement){
        try {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        } catch (Exception e) {
            System.err.println("Ejecutar");
            e.printStackTrace();
        }
        
    }
    
    public static void close(Connection connection){
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            System.err.println("Desconnectar");
            e.printStackTrace();
        }
        
    }
    
}
