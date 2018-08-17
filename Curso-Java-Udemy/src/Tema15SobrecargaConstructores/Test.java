/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema15SobrecargaConstructores;

/**
 *
 * @author pablo
 */
public class Test {
    public static void main(String[] args) {
        Empleado e= new Empleado("pedro", 29, 1800);
        System.out.println(e);
        Persona p= new Persona("Ximena", 25);
        System.out.println(p);
    }
    
}
