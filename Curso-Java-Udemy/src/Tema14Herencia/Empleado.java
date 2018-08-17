/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema14Herencia;

/**
 *
 * @author pablo
 */
public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorPersona;

    public Empleado() {
    }

    public Empleado(String nombre, double sueldo ) {
        super(nombre);
        this.idEmpleado = ++contadorPersona;
        this.sueldo = sueldo;
    }

    public int getId_persona() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString()+" Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}';
    }

   
    
    
    
    
}
