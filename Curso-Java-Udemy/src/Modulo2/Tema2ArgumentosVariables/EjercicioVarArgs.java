/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema2ArgumentosVariables;

/**
 *
 * @author pablo
 */
public class EjercicioVarArgs {
 
    public static void main(String[] args) {
        imprimirNumeros(15,20,3,61,75,18,10);
        imprimirForEach(15,20,3,61,75,18,10);
        imprimirParametros("Ximena", true, 15,20,14);
    }
    
    public static void imprimirNumeros(int... numeros ){
         int [] ordenado=numeros;
        System.out.println("Metodo1");
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.println(numeros[i]);
        }
    }
    
    public static void imprimirForEach(int... numeros) {
        System.out.println("Metodo 2");
        for(int num: numeros){
            System.out.println(num);
        }
    }
    
    public static void imprimirParametros(String nombre, boolean flag, int... numeros) {
       /**
        * Enviar al ultimo el argumento variable si recibe varios argumentos
        */
        System.out.println("Metodo 3");
       
        if (flag) {
            for (int num : numeros) {
                
                System.out.println(num);
            }
        } else {
            System.out.println("Nombre:"+ nombre+ " Bandera"+flag);
        }
    }
}

