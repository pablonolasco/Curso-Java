/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema13ClasesAbstractas;

import Modulo2.Tema10InstanceOf.*;

/**
 *
 * @author pablo
 */
public abstract class  FiguraGeometrica {

    /**
     *
     */
    protected String tipoFigura;

    protected FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    //La clase padre no define comportamiento
    public abstract void dibujar();

    public String getTipoFigura() {
        return "Tipo figura"+ tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    
}
