/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema8PasoValorReferencia;

/**
 *
 * @author pablo
 */
public class PasoPorValor {
    public static void main(String[] args) {
        int x=10;
        imprimir(x);
        cambiarValor(x);
        imprimir(x);
    }
    
    public static void cambiarValor(int i){
        i=200;
        
    }
    
    public static void imprimir(int arg){
        System.out.println("Valor:"+ arg);
    }
    
}
