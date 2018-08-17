/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema7AlcanceVariables;

/**
 *
 * @author pablo
 */
public class TestCaja {
    
    public static void main(String[] args) {
        int resultado;
        Caja c= new Caja(2, 6, 3);
        resultado=c.volumen();
        System.out.println("Resultado: "+resultado);
    }
    
}
