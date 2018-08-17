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
public class Mouse extends DeviceIn{
    private int idRaton;
    private static int contadorRatones;
    public Mouse(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton=++contadorRatones;
    }

    @Override
    public String toString() {
        return "Mouse{" + "idRaton=" + idRaton + super.toString() +'}';
    }
    
    
    
}
