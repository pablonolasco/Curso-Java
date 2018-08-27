/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema16Excepciones.Ejercicio.Datos;

import Modulo2.Tema14Interfaces.*;
import Modulo2.Tema16Excepciones.Ejercicio.Excepciones.AccesoDatosEx;

/**
 * Una interfaz puede heredar solo de otra interfaz
 * Una interfaz puede implementar varias interfaces
 * Una interfaz tiene que tener variables staticas
 * Una interfaz tiene que tener metodos abstractos publicos
 * @author pablo
 */
public interface AccesoDatos {
    
    //Indicamos que estos metodos pueden arrojar exception de tipo AccesoDatosEx
    public abstract void insertar() throws AccesoDatosEx;
    public abstract void listar() throws AccesoDatosEx;
    public abstract void simularError(boolean simularError);
    
}
