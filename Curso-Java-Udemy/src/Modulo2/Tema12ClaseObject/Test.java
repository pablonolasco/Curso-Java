/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema12ClaseObject;

import java.util.Objects;

/**
 *
 * @author pablo
 */
public class Test {

    public static void main(String[] args) {
        Empleado e1 = new Empleado("Ximena", 1110);
       
        Empleado e2 = new Empleado("Vianca", 1110);
        //Empleado e2 = new Empleado("Ximena", 1110);

        compararObjetos(e1, e2);
    }

    static void compararObjetos(Empleado e1, Empleado e2) {
        //Llamada metodo toString
//Por default se manda llamar el metodo toString dentro de println
        System.out.println("Contenido objeto:" + e1);
//Revision por referencia
        if (e1 == e2) {
            System.out.println("Los objetos tiene misma dirección de memoria");
        } else {
            System.out.println("Los objetos tiene distinta dirección de memoria");
        }
//Revision por el metodo equals
        if (e1.equals(e2)) {
            System.out.println("Los objetos tienen el mismo contenido, son iguales");
        } else {
            System.out.println( "Los objetos NO tienen el mismo contenido, NO son iguales");
        }
//Revisamos el metodo hashCode
        if (e1.hashCode() == e2.hashCode()) {
            System.out.println("Los objetos tienen el mismo codigo hash");
        } else {
            System.out.println("Los objetos NO tienen el mismo codigo hash");
        }
    }
}
