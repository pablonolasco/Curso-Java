/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema7ModificadoresAcceso1;
import Modulo2.Tema7ModificadoresAcceso2.*;
/**
 *
 * @author pablo
 */
public class Modificadores {
     public static void main(String[] args) {
        //Prueba de accesos a Clase1 desde otras clases
        //Acceso a Clase 1 desde Clase2
        System.out.println("***Acceso desde Clase 2 a Clase 1 (mismo paquete)***");
        new Clase2().pruebaDesdeClase2();

        //Acceso a Clase 1 desde Clase2
        //Clase 3 extiende de Clase 1
        System.out.println("\n***Acceso desde Clase 3 a Clase 1 (diferente paquete, pero es subclase)***");
        new Clase3().pruebaDesdeClase3();

        //Acceso a Clase 1 desde Clase4
        //Clase4 NO es subclase y esta en otro paquete
        System.out.println("\n***Acceso desde Clase 4 a Clase 1 (diferente paquete, NO es subclase)***");
        new Clase4().pruebaDesdeClase4();
    }
}
