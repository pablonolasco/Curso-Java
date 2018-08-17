/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema13ContextoEstaticoDinamico;

/**
 *
 * @author pablo
 */
public class Persona {
    private String nombre;
    private int idPersona;
    private static int contadorPersona;

    public Persona(String nombre) {
        contadorPersona++;
        this.nombre = nombre;
        idPersona = contadorPersona;
    }
    
    public static int getContadorPersonas(){
        return contadorPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
}
