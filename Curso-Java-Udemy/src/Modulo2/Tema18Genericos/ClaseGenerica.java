/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema18Genericos;

/**
 *
 * @author pablo
 */
//Definimos clase generica con el operador diamante <> 
public class ClaseGenerica <T>{
    
    //Definimos una variable de tipo generico
    T objeto;

    //Constructor que inicializa el tipo a utilizar
    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo T es : "+objeto.getClass().getName());
    }
    
    
}
