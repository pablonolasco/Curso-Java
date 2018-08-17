/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema12Encapsulaiento;

/**
 *
 * @author pablo
 */
public class Persona {
    private String nombre;
    private String apellido;
    private boolean borrado;

    public Persona() {
    }

    public Persona(String nombre, String apellido, boolean borrado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.borrado = borrado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", borrado=" + borrado + '}';
    }
    
    
}
