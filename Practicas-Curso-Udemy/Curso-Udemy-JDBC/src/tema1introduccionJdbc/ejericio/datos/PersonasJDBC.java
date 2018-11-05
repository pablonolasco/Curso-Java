/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1introduccionJdbc.ejericio.datos;

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

    public int insert(String nombre, String apellido) {

        int rows = 0;//registros afectados
        try {
            connection = Conexion.getConnection();
            stmt = connection.prepareStatement(SQL_INSERT);
            int indice = 1;
            this.stmt.setString(indice++, nombre);
            this.stmt.setString(indice++, nombre);
            System.out.println("Ejecutando Query" + this.SQL_INSERT);
            rows = this.stmt.executeUpdate();
            System.out.println("Registros afectados" + rows);
        } catch (SQLException e) {
            System.err.println("Error al insertar");
            e.printStackTrace();
        } finally {
            Conexion.close(stmt);
            Conexion.close(connection);
        }
        return rows;
    }

    public int update(int id_persona, String nombre, String apellido) {
        int rows = 0;
        try {
            this.connection = Conexion.getConnection();
            this.stmt = connection.prepareStatement(SQL_UPDATE);
            int indice = 1;
            this.stmt.setString(indice++, nombre);
            this.stmt.setString(indice++, apellido);
            this.stmt.setInt(indice, id_persona);
            System.out.println("Ejecutando sentencia " + this.SQL_UPDATE);
            this.stmt.executeUpdate();
            System.out.println("Registros actualizados " + rows);

        } catch (SQLException e) {
            System.err.println("Error al actualizar datos");
            e.printStackTrace();
        } finally {
            Conexion.close(this.stmt);
            Conexion.close(this.connection);
        }

        return rows;
    }

    public int eliminar(int id_persona) {
        int rows = 0;
        try {
            this.connection = Conexion.getConnection();
            this.stmt = connection.prepareStatement(SQL_DELETE);
            this.stmt.setInt(1, id_persona);
            rows = this.stmt.executeUpdate();
             System.out.println("Registros eliminados " + rows);
        } catch (SQLException e) {
            System.err.println("Error al actualizar datos");
            e.printStackTrace();
        } finally {
            Conexion.close(this.stmt);
            Conexion.close(this.connection);
        }
        return rows;

    }
    
    public List<Persona> listar(){
        List<Persona> listPersonas= new ArrayList<>();
        try {
            this.connection=Conexion.getConnection();
            this.stmt=connection.prepareStatement(SQL_SELECT);
            this.res=stmt.executeQuery();
            
            while (res.next()) {
                Persona persona= new Persona();
                persona.setId_persona(res.getInt(1));
                persona.setNombre(res.getString(2));
                persona.setApellido(res.getString(3));
                listPersonas.add(persona);
                
            }
            
        } catch (SQLException e) {
            System.err.println("Error al actualizar datos");
            e.printStackTrace();
        } finally {
            Conexion.close(this.stmt);
            Conexion.close(res);
            Conexion.close(this.connection);
        }
        
        return listPersonas;
    }

}
