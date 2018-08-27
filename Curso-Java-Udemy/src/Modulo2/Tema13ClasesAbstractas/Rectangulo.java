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
public class Rectangulo extends FiguraGeometrica{

    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }
    public void dibujar(){
         //Comportamiento subclase
         //manda a llamar el nombre de la clase con la cual se esta trabajando, en este caso circulo
        System.out.println("dibujar un "+ this.getClass().getSimpleName());
    }
}
