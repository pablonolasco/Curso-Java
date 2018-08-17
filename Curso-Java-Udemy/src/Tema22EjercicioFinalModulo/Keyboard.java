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
public class Keyboard extends DeviceIn{
    private int idTeclado;
    private static int contadorTeclado;
    public Keyboard(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado=++contadorTeclado;
    }

    @Override
    public String toString() {
        return "Keyboard{" + "idTeclado=" + idTeclado + super.toString()+ '}';
    }
    
}
