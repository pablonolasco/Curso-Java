/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema13ContextoEstaticoDinamico;

/**
 *
 * @author pablo
 */
public class Test {
    public static void main(String[] args) {
        Persona p= new Persona("Juan");
        Persona persona= new Persona("Pablo");
        System.out.println(p);
        System.out.println(persona);
        System.out.println("Personas:"+Persona.getContadorPersonas());
    }
    
}
