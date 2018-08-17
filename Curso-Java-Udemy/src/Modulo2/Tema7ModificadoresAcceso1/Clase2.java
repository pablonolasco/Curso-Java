/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema7ModificadoresAcceso1;

/**
 *
 * @author pablo
 */
public class Clase2 {
   public Clase2() {
        //Prueba constructores
        System.out.println("");
        //Constructor publico
        new Clase1(1);
        //Constructor protegido
        new Clase1(1, 2);
        //Constructor default o package
        new Clase1(1, 2, 3);
        //Constructor private
        //new Clase1(1, 2, 3,4); 
        System.out.println("Constructor private: Acceso negado");
    }

    public void pruebaDesdeClase2() {
        //Acceso a Clase 1 desde Clase2
        Clase1 c1 = new Clase1();
        System.out.println("");
        System.out.println("Atributo publico:" + c1.atrPublico);
        System.out.println("Atributo protegido:" + c1.atrProtected);
        System.out.println("Atributo default:" + c1.atrPaquete);
        System.out.println("Atributo private: Acceso negado");

        System.out.println("");
        System.out.println("Metodo publico:" + c1.metdoPublic());
        System.out.println("Metodo protegido:" + c1.metdoProtected());
        System.out.println("Metodo default:" + c1.metdoPaquete());
        System.out.println("Metodo private: Acceso negado");
    } 
}
