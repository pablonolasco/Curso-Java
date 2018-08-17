/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema22EjercicioFinalModulo;

import javax.management.monitor.Monitor;

/**
 *
 * @author pablo
 */
public class Computer {
    private int idComputadora;
    private static int contadorComputadora;
    private String nombre;
    private Display monitor;
    private Keyboard teclado;
    private Mouse raton;
    private double  precio;

    public Computer(String nombre, Display monitor, Keyboard teclado, Mouse raton,
            double  precio) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
        this.precio=precio;
    }

    private Computer() {
        this.idComputadora=++contadorComputadora;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Display getMonitor() {
        return monitor;
    }

    public void setMonitor(Display monitor) {
        this.monitor = monitor;
    }

    public Keyboard getTeclado() {
        return teclado;
    }

    public void setTeclado(Keyboard teclado) {
        this.teclado = teclado;
    }

    public Mouse getRaton() {
        return raton;
    }

    public void setRaton(Mouse raton) {
        this.raton = raton;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Computer{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton +  ", precio=" + precio + '}';
    }
    
    
}
