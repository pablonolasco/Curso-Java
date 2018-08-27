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
public class OperatiobExcepcion extends Exception implements Serializable{

    public OperatiobExcepcion(String mensaje) {
        //Inicializamos el mensaje de error de la clase padre
        super(mensaje);
    }
    
}
