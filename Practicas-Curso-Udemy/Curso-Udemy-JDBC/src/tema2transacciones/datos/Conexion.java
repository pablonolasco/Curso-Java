/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2transacciones.datos;

import tema1introduccionJdbc.ejericio.datos.*;
import java.sql.*;

/**
 *
 * @author pablo
 */
public class Conexion {

    private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static String JDBC_URL = "jdbc:mysql://localhost/sga?useSSL=false";
    private static String JDBC_USER = "root";
    private static String JDBC_PASS = "";
    private static Driver driver;

    /**
     * synchronized indica que este metodo solo podra ser ejecutado por un solo
     * hilo
     *
     * @return
     * @throws SQLException
     */
    public static synchronized Connection getConnection() throws SQLException {
        if (driver == null) {
            try {
                //Registar el driver en memoria
                Class jdbcDriver = Class.forName(JDBC_DRIVER);
                driver = (Driver) jdbcDriver.newInstance();
                DriverManager.registerDriver(driver);

            } catch (Exception e) {
                System.err.println("Error:");
                e.printStackTrace();
            }
        }
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }

    /**
     * Metodo para cerrar Resulset
     * @param resultSet 
     */
    public static void close(ResultSet resultSet) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException e) {
            System.err.println("Error al desconectar ResultSet");
            e.printStackTrace();
        }

    }

    /**
     * Metodo para cerrar PreparedStatement
     * @param ps 
     */
    public static void close(PreparedStatement ps) {
        try {
            if (ps != null) {
                ps.close();
            }

        } catch (SQLException e) {
            System.err.println("Error al desconectar PreparedStatement");
            e.printStackTrace();
        }
    }

    /**
     * Metodo para cerrar la conexion a la Bd
     * @param connection 
     */
    public static void close(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.err.println("Error al desconectar Connection");
            e.printStackTrace();
        }

    }
}
