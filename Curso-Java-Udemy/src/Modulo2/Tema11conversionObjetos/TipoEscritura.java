/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema11conversionObjetos;

/**
 *
 * @author pablo
 */
public enum TipoEscritura {
    CLASICO("Escritura a Mano"),
    MODERNA("Escritura Digital");
    
    private final String DESCRIPCION;
    
    private TipoEscritura(String descripcion){
        this.DESCRIPCION=descripcion;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }
    
    
}
