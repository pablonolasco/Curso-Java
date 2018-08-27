/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema16Excepciones;
import java.io.Serializable;
/**
 *
 * @author pablo
 */
public class Division implements Serializable{
    
    private int mNumerador;
    private int mDenominador;

    public Division(int mNumerador, int mDenominador) throws OperatiobExcepcion{
        // Este es un check exepcion, cuando se hereda de la clase Excepcion estamos
        //Obligador a declarar la exepcion dentro de los metodo o constructor
        //Y cada clase que herede de la clase division debera implementar 
        //throws OperationException, y esto es una desventaja de los check excepcion
        //RuntimeExcepcion son excepciones uncheck
        
        if(mDenominador == 0){
            //Excepcio de la api de java
            //throw new IllegalArgumentException ("Denominador igual a cero")
            //Enviamos la excepcion personalizada al constructor de la clase 
            throw new OperatiobExcepcion("Denominador igual a cero");
       }
            this.mNumerador = mNumerador;
            this.mDenominador = mDenominador;
         
    }
    
    public void visualizarOperacion(){
        System.out.println("El resultado es: "+this.mNumerador/this.mDenominador);
    }
    
    
}
