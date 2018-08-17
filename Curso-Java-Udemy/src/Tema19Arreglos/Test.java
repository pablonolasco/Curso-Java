/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema19Arreglos;

/**
 *
 * @author pablo
 */
public class Test {
    public static void main(String[] args) {
        // Siempre en plurales
        // Arreglos de tipo de datos primitivos
        // int [] enteros;
        // boolean banderas [];
        // float flotantes [];
        
        /* Tipo object*/
        // Persona personas[];
        // String letras [];
        
        /* Instancia Arreglos*/
        // int enteros [] = new int[10];
        // boolean banderas = new boolean[5];
        // Persona personas= new Persona[5];
        
        //Agregar elementos
        // personas[0]= new Persona("Pedro","Lara");
        // cadenas [1]= new String ("Juan");
        
        int [] edades= new int[1];
        
        edades[0]=10;
        
        
        System.out.println("Edad "+ edades[0]);
        
        Persona persona[];
        Persona personas []={new Persona("Ximena")};
        persona= new Persona[2];
        persona[0]= new Persona("Juan");
        persona[1]= new Persona("Jose");
        
        System.out.println(persona[0]);
        System.out.println(personas[0]);
        
        
    }
}
