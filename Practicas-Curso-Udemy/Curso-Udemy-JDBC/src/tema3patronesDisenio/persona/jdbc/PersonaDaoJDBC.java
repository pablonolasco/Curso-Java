/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3patronesDisenio.persona.jdbc;

import java.util.List;
import tema3patronesDisenio.persona.dto.PersonaDto;
import java.sql.*;
import java.util.ArrayList;
import tema3patronesDisenio.persona.jdbc.Conexion;

/**
 * Esta clase implementa la clase PersonaDao es una implementacion con la
 * tecnologia JDBC podría haber otro tipo de implementaciones con tecnologias
 * como Hibernate, iBatis, SpringJDBC, etc.
 * @author pablo
 */
public class PersonaDaoJDBC implements IPersonaDAO {

    private Connection connection;
    private static final String INSERT = "insert into persona (nombre, apellido) values (?,?)";
    private static final String UPDATE = "update persona set nombre=?, apellido=? where id_persona=?";
    private static final String DELETE = "delete from persona where id_persona=? ";
    private static final String SELECT = "select id_persona, nombre, apellido from persona";
    private PreparedStatement stmt;
    private ResultSet rs;

    public PersonaDaoJDBC() {
    }

    public PersonaDaoJDBC(Connection conn) {
        this.connection = conn;
    }
    /**
    * El metodo insert recibe como argumento
    * un objeto DTO el cual viene de
    * otra capa, y se extraen sus valores para crear un nuevo registro
    */
    @Override
    public int insertar(PersonaDto personaDto) throws SQLException {
        int rows = 0;

        try {
            Connection conn = null;
            //comprobar si la variable conexion ya fue inicilizada, si manda false generamos una nueva
            conn = (this.connection != null) ? this.connection : Conexion.getConnection();
            int indice = 1;
            stmt = conn.prepareStatement(INSERT);
            stmt.setString(indice++, personaDto.getmNombre());
            stmt.setString(indice++, personaDto.getmApellido());
            rows = stmt.executeUpdate();
            System.out.println("Insert correcto");
        } finally {
            Conexion.close(stmt);
            if (this.connection == null) {
                Conexion.close(connection);
            }
        }
        return rows;
    }

    @Override
    public int update(PersonaDto personaDto) throws SQLException {
        Connection conn;
        int rows = 0;
        int indice = 1;
        try {
            conn = (this.connection != null) ? this.connection : Conexion.getConnection();
            stmt = conn.prepareStatement(UPDATE);
            stmt.setString(indice++, personaDto.getmNombre());
            stmt.setString(indice++, personaDto.getmApellido());
            stmt.setInt(indice++, personaDto.getMidPersona());
            rows = stmt.executeUpdate();
            System.out.println("update correcto");
        } finally {
            Conexion.close(stmt);
            if (this.connection == null) {
                Conexion.close(connection);
            }
        }
        return rows;
    }

    @Override
    public int eliminar(PersonaDto personaDto) throws SQLException {
        Connection conn;
        int rows = 0;
        try {
            conn = (this.connection != null) ? this.connection : Conexion.getConnection();
            stmt = conn.prepareStatement(DELETE);
            stmt.setInt(1, personaDto.getMidPersona());
            rows = stmt.executeUpdate();
            System.out.println("delete correcto");
        } finally {
            Conexion.close(stmt);
            if (this.connection == null) {
                Conexion.close(this.connection);

            }
        }
        return rows;

    }

    @Override
    public List<PersonaDto> select() throws SQLException {
        List<PersonaDto> personasDtos = new ArrayList<>();
        PersonaDto personaDto;

        try {
            Connection conn = null;
            conn = (this.connection != null) ? this.connection : Conexion.getConnection();
            stmt = conn.prepareStatement(SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                personaDto = new PersonaDto();
                personaDto.setMidPersona(rs.getInt(1));
                personaDto.setmNombre(rs.getString(2));
                personaDto.setmApellido(rs.getString(3));
                personasDtos.add(personaDto);
            }
            System.out.println("select correcto");

        } finally {
            Conexion.close(stmt);
            Conexion.close(rs);
            if (this.connection == null) {
                Conexion.close(connection);
            }
        }

        return personasDtos;
    }

}
