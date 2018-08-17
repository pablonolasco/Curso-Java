/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema15SobrecargaConstructores;

/**
 *
 * @author pablo
 */
public class Persona {
    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersona;
    
    private Persona(){
       this.idPersona= ++contadorPersona;
    }

    public Persona(String nombre, int edad) {
        //Manada a llamar al constructor privado, cualquier llamada
        //a otro costructor va al inicio, si es un costructor con parametros, 
        //se deben colocar
        this();
        this.nombre = nombre;
        this.edad=edad;
        
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
    
    
    
}
