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
public class Operaciones {
    //Debe estar definido con un solo nombre
    //No se toma en cuenta el retorno del metodo
    //Deben coincidir el numero de argumentos
    //No importa el orden
    public  static int sumar(int a, int b){
        return a+b;
        
    }
    
    public static  double sumar(double  a, double b){
        return a+b;
        
    }
    
    public static double sumar(int a, double b){
        return a+b;
    }
    
    public static double sumar(double b, int a){
        return b+a;
    }

   
}
