/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema9Polimorfismo;

import Modulo2.Tema8Sobreescitura.*;

/**
 *
 * @author pablo
 */
public class Test {
    public static void main(String[] args) {
        Empleado e= new Empleado("Ximena", 110);
        Gerente g= new Gerente("Vianca", 1111, "TICS");
        impimirDetaller(e);
        impimirDetaller(g);
    }
    
    //Observamos que el tipo que recibe el metodo es de tipo padre (Empleado)
    //Sin embargo al momento de ejecutar el metodo, se ejecuta el del hijo (Gerente)
    //eso es el polimorfismo, multiples formas pero en tiempo de ejecucion
    static void impimirDetaller(Empleado empleado){
        System.out.println(empleado.obtenerDetalle());
        
    }
}
