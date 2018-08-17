/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema16SobrecargaMetodos;

/**
 *
 * @author pablo
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Sumar 1:"+Operaciones.sumar(3, 4));
        System.out.println("Sumar 2:"+Operaciones.sumar(3, 4.5));
        System.out.println("Sumar 3:"+Operaciones.sumar(3.4, 2.5));
        System.out.println("Sumar 4:"+Operaciones.sumar(3F, 'A'));
        
    }
}
