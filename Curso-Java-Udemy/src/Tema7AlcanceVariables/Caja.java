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
public class Caja {
    int alto;
    int profundo;
    int ancho;
    
    int volumen(){
        return ancho*alto*profundo;
    }

    public Caja() {
    }

    public Caja(int alto, int profundo, int ancho) {
        this.alto = alto;
        this.profundo = profundo;
        this.ancho = ancho;
    }
}
