/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3patronesDisenio.persona.jdbc;
import java.sql.*;

/**
 *
 * @author pablo
 */
public class Conexion {
    private static final String DRIVER_BD="com.mysql.jdbc.Driver";
    private static final String USER_BD="root";
    private static final String PASS_BD="";
    private static final String URL_BD="jdbc:mysql://localhost/sga?useSSL=false";
    private static Driver driver;
    public Conexion() {
    }
    
    public static synchronized Connection getConnection()throws SQLException{
        if (driver==null) {
            try {
                Class jdbClass=Class.forName(DRIVER_BD);
                driver=(Driver)jdbClass.newInstance();
                DriverManager.registerDriver(driver);
            } catch (Exception e) {
                System.err.println("Error Conexion");
                e.printStackTrace();
            }
        }
       return DriverManager.getConnection(URL_BD, USER_BD, PASS_BD);
    }
    
    public static void close(ResultSet rs){
        try {
            if (rs != null) rs.close();
        } catch (SQLException e) {
            System.err.println("Error Result Close");
            e.printStackTrace();
        }
        
    }
    
    public static void close(PreparedStatement ps){
        try {
            if (ps != null) ps.close();
        } catch (SQLException e) {
            System.err.println("Error PreparedStatement close");
        }
        
    }
    
    public static void close(Connection conn){
        try {
            if (conn != null)  conn.close();
        } catch (SQLException e) {
            System.err.println("Error Connection close");
            e.printStackTrace();
        }
    }
    
    
}
