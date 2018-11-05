/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3patronesDisenio.laboratorioFinal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tema3patronesDisenio.laboratorioFinal.dto.UsuarioDTO;

/**
 *
 * @author pablo
 */
public class UsuarioDaoJDBC implements IUsuarioDAO{
    private Connection connection;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private final static String SQL_INSERT="INSERT INTO usuario(usuario,pwd) values(?,?)"; 
    private final static String SQL_UPDATE="UPDATE  usuario set usuario=?,pwd=? where id_usuario=?"; 
    private final static String SQL_DELETE="DELETE from usuario where id_usuario=?"; 
    private final static String SQL_SELECT="SELECT id_usuario,usuario,pwd from usuario"; 

    
    public UsuarioDaoJDBC (){
        
    }
    public UsuarioDaoJDBC(Connection connection) {
        this.connection = connection;
    }
    
    
    @Override
    public int insertar(UsuarioDTO user) throws SQLException {
        Connection temp;
        int rows=0;
        int indice=1;
        try {
            temp=(this.connection !=null)?this.connection:Conexion.getConnection();
            preparedStatement=temp.prepareStatement(SQL_INSERT);
            preparedStatement.setString(indice++, user.getmUsuario());
            preparedStatement.setString(indice++, user.getmPassword());
            rows= preparedStatement.executeUpdate();
            System.out.println("Ejecutando insert");
        } finally {
            Conexion.close(preparedStatement);
            if(this.connection!=null){
                Conexion.close(connection);
            }
        }
        return rows;
    }

    @Override
    public int update(UsuarioDTO user) throws SQLException {
     Connection temp;
     int rows=0;
     int indice=1;
        try {
            temp=(this.connection != null)?this.connection:Conexion.getConnection();
            preparedStatement=temp.prepareStatement(SQL_UPDATE);
            preparedStatement.setString(indice++, user.getmUsuario());
            preparedStatement.setString(indice++, user.getmPassword());
            preparedStatement.setInt(indice, user.getmIdUsuario());
            rows=preparedStatement.executeUpdate();
            System.out.println("Ejecutando update");
            
        } finally {
            Conexion.close(preparedStatement);
            if(this.connection != null)Conexion.close(connection);
        }
     return rows;
    }

    @Override
    public int eliminar(UsuarioDTO user) throws SQLException {
        Connection temp;
        int rows=0;
        int indice=1;
        try {
            temp=(this.connection != null)?this.connection:Conexion.getConnection();
            preparedStatement=temp.prepareStatement(SQL_DELETE);
            preparedStatement.setInt(indice++, user.getmIdUsuario());
            rows=preparedStatement.executeUpdate();
        } finally {
            Conexion.close(preparedStatement);
            if(this.connection != null)Conexion.close(connection);
        }
        return rows;
    }

    @Override
    public List<UsuarioDTO> lista() throws SQLException {
        Connection temp;
        List<UsuarioDTO>listUsuarios= new ArrayList<>();
        UsuarioDTO usuario;
        try {
            temp=(this.connection != null)?this.connection:Conexion.getConnection();
            preparedStatement=temp.prepareStatement(SQL_SELECT);
            resultSet=(ResultSet)preparedStatement.executeQuery();
            while(resultSet.next()){
                usuario= new UsuarioDTO();
                usuario.setmIdUsuario(resultSet.getInt(1));
                usuario.setmUsuario(resultSet.getString(2));
                usuario.setmPassword(resultSet.getString(3));
                listUsuarios.add(usuario);
            }
            System.out.println("Obteniendo informacion");
        } finally  {
            Conexion.close(preparedStatement);
            Conexion.close(resultSet);
            if(this.connection != null)Conexion.close(connection);
        }
        return listUsuarios;
    }
    
}
