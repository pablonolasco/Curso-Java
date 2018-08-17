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
public class EjemploVarArgs {
    public static void main(String[] args) {
        mostrar(1,2,3,5);
        mostrarValores("Juan", false, 1,4,5,8,8);
    }
    
    public static void mostrar(int... numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
            System.out.println("N:" + numero);
        }

        System.out.println("Suma:"+suma);
    }
    
    public  static void mostrarValores(String nombre, boolean valido, int... datos){
        if(valido){
            for (int dato : datos) {
                System.out.println(dato);
            }
        }else{
            System.out.println("Nombre "+nombre);
        }
    }
}
