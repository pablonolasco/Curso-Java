/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema16Excepciones.Ejercicio.Manejo;

import Modulo2.Tema16Excepciones.Ejercicio.Datos.*;
import Modulo2.Tema16Excepciones.Ejercicio.Excepciones.*;

/**
 *
 * @author pablo
 */
public class Test {

    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionMYSQL();
        //Cambiamos el estado a simuladorError=true
        datos.simularError(true);
        ejecutar(datos, "listar");
        //Cambiamos el estado a simuladorError=false
        datos.simularError(true);
        ejecutar(datos, "insertar");
    }

    static void ejecutar(AccesoDatos datos, String accion) {
        if ("listar".equalsIgnoreCase(accion)) {
            try {
                datos.listar();
            } //Si se van a procesar varias excepciones de la misma jerarquia
            //siempre se debe procesar primero la excepcion de menor jerarquia
            //y posteriormente la de mayor jerarquia
            catch (LecturaDatosEx ex) {
                System.out.println("Error lectura: Procesa la excepcion mas especifica de lectura de datos");
            } catch (AccesoDatosEx datosEx) {
                System.out.println("Error Acceso datos: Procesa la excepcion mas generica de acceso a datos");

            } catch (Exception e) {
                System.out.println("Error general");

            } finally {
                System.out.println("Procesar finally es opcional, siempre se ejecutara sin importar si hubo error o no");

            }
        } else if ("insertar".equals(accion)) {
            try {
                datos.insertar();
            } catch (AccesoDatosEx ex) {
                System.out.println("Error acceso datos: Podemos procesar solo la excepcion mas generica");
            } finally {
                System.out.println("Procesar finally es opcional, siempre se ejecutara sin importar si hubo error o no");
            }
        } else {
            System.out.println("No se proporciono ninguna accion conocida");
        }

    }

}
