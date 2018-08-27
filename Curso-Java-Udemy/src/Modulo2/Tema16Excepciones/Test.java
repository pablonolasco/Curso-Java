/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema16Excepciones;

/**
 *
 * @author pablo
 */
public class Test {

    public static void main(String[] args) {
        try {
            Division division = new Division(4, 0);
            division.visualizarOperacion();
        } catch (OperatiobExcepcion oe) {
            System.err.println("Ocurrio un Error!");
            // Pila de exepciones printStackTrace
            oe.printStackTrace();
            
        }

    }
}
