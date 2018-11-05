/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3patronesDisenio.persona.jdbc;

import java.sql.SQLException;
import java.util.List;
import tema3patronesDisenio.persona.dto.PersonaDto;
/**
 * Esta interfaz contiene los métodos abstractos con las
 * operaciones básicas sobre la tabla de Persona
 * CRUD (Create, Read, Update y Delete)
 * Se debe crear una clase concreta para implementar el
 * código asociado a cada método

 * @author pablo
 */
public interface IPersonaDAO {
    
    public abstract int insertar(PersonaDto personaDto)throws SQLException;
    public abstract int update(PersonaDto personaDto)throws SQLException;
    public abstract int eliminar(PersonaDto personaDto)throws SQLException;
    public abstract List<PersonaDto> select()throws SQLException;
    
}
