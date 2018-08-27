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
public class Test {

    public static void main(String[] args) {
        FiguraGeometrica rectangulo;
        rectangulo = new Rectangulo("Reactangulo");
       
        FiguraGeometrica circulo;
        circulo = new Circulo("Circulo");
       
        FiguraGeometrica cuadrado;
        cuadrado = new Cuadrado("Cuadrado");
       
        rectangulo.dibujar();
        circulo.dibujar();
        cuadrado.dibujar();
        
        
    }

}
