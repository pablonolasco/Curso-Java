/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3patronesDisenio.persona.test;

import java.sql.SQLException;
import java.util.List;
import tema3patronesDisenio.persona.dto.PersonaDto;
import tema3patronesDisenio.persona.jdbc.IPersonaDAO;
import tema3patronesDisenio.persona.jdbc.PersonaDaoJDBC;

/**
 *
 * @author pablo
 */
public class Test {

    public static void main(String[] args) {
        IPersonaDAO personaDAO = new PersonaDaoJDBC();
        //Creamos un nuevo registro
        //Hacemos uso de la clase persona DTO la cual se usa
        //para transferiri la informacion entre las capas
        //no es necesario especificar la llave primaria
        //ya que en este caso es de tipo autonumerico y la BD se encarga
        //de asignarle un nuevo valor

        PersonaDto personaDto = new PersonaDto();
        personaDto.setmNombre("prueba");
        personaDto.setmApellido("prueba");
        //Utilizamos la capa DAO para persistir el objeto DTO

        try {
            //personaDAO.insertar(personaDto);
            //eliminamos un registro, el id 3
            //personaDao.delete( new PersonaDTO(3));

            //actualizamos un registro
            PersonaDto personaTmp = new PersonaDto();
             personaTmp.setMidPersona(2);//actualizamos el registro 2
             personaTmp.setmNombre("Mario");
             personaTmp.setmApellido("lopez02");
             personaDAO.update(personaTmp);
            //Seleccionamos todos los registros
            List<PersonaDto> personas = personaDAO.select();
            for (PersonaDto personaDTO : personas) {
                System.out.print(personaDTO);
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println("Excepcion en la capa de prueba");
            e.printStackTrace();
        }

    }
}
