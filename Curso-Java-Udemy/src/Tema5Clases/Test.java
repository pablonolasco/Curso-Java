/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema5Clases;

/**
 *
 * @author pablo
 */
public class Test {
    public static void main(String[] args) {
        Persona p1= new Persona();
        Persona p2;
        
        //Modificar valors
        p1.nombre="Pablo";
        p1.apellido="Nolasco";
        p1.edad=27;
        p1.desplegar();
        p2=p1;
        
        p2.nombre="Ximena";
        p2.edad=20;
        p2.desplegar();
    }
}
