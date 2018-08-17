/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema18PalabraFinal;

/**
 *
 * @author pablo
 */
public class Test {
    public static void main(String[] args) {
        
        //ClaseFinal.varPrimitivo=20; No se pueden cambiar los valores a las palabras final
        System.out.println("Nombre persona: "+ClaseFinal.p.getNombre());
        
        //No es posible cambiar la referencia de la variable persona
        //ClaseFinal.p= new Persona();
        //Pero si el valor
        ClaseFinal.p.setNombre("otro");
        
        System.out.println("Nmbre persona: " + ClaseFinal.p.getNombre());
    }
}
