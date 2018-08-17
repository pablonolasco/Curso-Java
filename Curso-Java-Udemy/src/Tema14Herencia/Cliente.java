/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema14Herencia;

import java.util.Date;

/**
 *
 * @author pablo
 */
public class Cliente extends Persona{
    private int idCliente;
    private java.util.Date fechaRegistro;
    private boolean tipo;
    private static int contadorCliente;

    public Cliente(Date fechaRegistro, boolean tipo) {
        this.idCliente=++contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.tipo = tipo;
       
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+" Cliente{" + "idCliente=" + idCliente + 
                ", fechaRegistro=" + fechaRegistro + ", tipo=" + tipo + '}';
    }
    
    
    
}
