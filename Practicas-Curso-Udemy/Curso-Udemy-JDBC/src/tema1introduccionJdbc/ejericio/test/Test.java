/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1introduccionJdbc.ejericio.test;
import java.util.List;
import tema1introduccionJdbc.ejericio.datos.PersonasJDBC;
import tema1introduccionJdbc.ejericio.domain.Persona;
/**
 *
 * @author pablo
 */
public class Test {
    public static void main(String[] args) {
        PersonasJDBC personasJDBC= new PersonasJDBC();
        //insert
       // personasJDBC.insert("Alberto", "Juarez");
        //update
       // personasJDBC.update(4, "Nombre", "Apellido");
        //delete
        personasJDBC.eliminar(6);
        //Consultar
        List<Persona>personas=personasJDBC.listar();
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
