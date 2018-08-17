/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema22EjercicioFinalModulo;

/**
 *
 * @author pablo
 */
public class DeviceIn {
    private String tipoEntrada;
    private String marca;

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public DeviceIn(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return  " tipoEntrada=" + tipoEntrada + ", marca=" + marca;
    }
    
    
}
