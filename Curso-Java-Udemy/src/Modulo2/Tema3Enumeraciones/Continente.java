/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema3Enumeraciones;

/**
 *
 * @author pablo
 */
public enum Continente {
    AFRICA(53),
    EUROPA(46),
    ASIA(26),
    AMERICA(34),
    OCEANIA(14);
    
    //variable para dar valor a las enumeraciones
    private final int PAIS;

    //constructor para asignar valor a cada enumeracion
    private Continente(int PAIS) {
        this.PAIS = PAIS;
    }

    //metodo para obtener el numero de paises por continente
    public int getPAIS() {
        return PAIS;
    }
    
    
    
}
