/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema5ForEach;
import Tema14Herencia.Persona;
/**
 *
 * @author pablo
 */
public class EjemploForEach {
    public static void main(String[] args) {
        Persona p[]= {new Persona("Ximena"), new Persona("Pedro")};
        for (Persona persona : p) {
            //Accedemos a las propiedades
            String nombre= persona.getNombre();
            System.out.println("Name "+nombre);
        }
    }
}
