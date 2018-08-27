/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema16Excepciones.Ejercicio.Datos;

import Modulo2.Tema14Interfaces.*;
import Modulo2.Tema16Excepciones.Ejercicio.Datos.*;
import Modulo2.Tema16Excepciones.Ejercicio.Excepciones.*;

/**
 *
 * @author pablo
 */
public class ImplementacionMYSQL implements AccesoDatos {

    private boolean simularError;

    /**
     * Cuando se declara esta firma @throws AccesoDatosEx se indica que puede
     * arrojar excepciones de mayor jerarquia o de menor jerarquia, por ejemplo
     * se manda a llamar a la clase hija de escritura pero tambien se puede
     * mandar a llamar a la clae hija lectura excepcion
     *
     * @throws AccesoDatosEx
     */
    @Override
    public void insertar() throws AccesoDatosEx {

        if (simularError) {
            throw new EscrituraDatosEx("Error de escritura de datos");
        } else {
            System.out.println("Insertar desde MYSQL");
        }
    }

    @Override
    public void listar() throws AccesoDatosEx {
        if (simularError) {
            throw new LecturaDatosEx("Error de escritura de datos");
        } else {
            System.out.println("Listar desde MYSQL");
        }

    }
    
    public boolean isSimularError(){
        return simularError;
    }
    @Override
    public void simularError(boolean simularError) {
       this.simularError=simularError;
    }

}
