/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema14Interfaces;

/**
 * Una interfaz puede heredar solo de otra interfaz
 * Una interfaz puede implementar varias interfaces
 * Una interfaz tiene que tener variables staticas
 * Una interfaz tiene que tener metodos abstractos publicos
 * @author pablo
 */
public interface AccesoDatos {
    
    public static final int MAX_REGISTROS=10;
    public abstract void insertar();
    public abstract void listar();
    
}
