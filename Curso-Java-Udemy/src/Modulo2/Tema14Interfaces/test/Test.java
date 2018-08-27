/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema14Interfaces.test;

import Modulo2.Tema14Interfaces.*;

/**
 *
 * @author pablo
 */
public class Test {
    
    public static void main(String[] args) {
        //Solo se puede referenciar a clases que hayan implementado la interfaz
        AccesoDatos datos = new ImplementacionOracel();
        ejecutar(datos, "listar");
        datos= new ImplementacionMYSQL();
        ejecutar(datos, "insertar");
        
    }
    
    static void ejecutar(AccesoDatos datos, String accion) {
        if ("listar".equalsIgnoreCase(accion)) {
            datos.listar();
        } else if ("insertar".equalsIgnoreCase(accion)) {
            datos.insertar();
        }
    }
}

