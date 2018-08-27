/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema18Genericos;

/**
 *
 * @author pablo
 */
public class Test {
    public static void main(String[] args) {
        //Creamos una instancia ClaseGnerica para Integer
        //Solo permite tipo Objetos
        ClaseGenerica<Integer> obGenerica=new ClaseGenerica<Integer>(15);
        obGenerica.obtenerTipo();
        
        ClaseGenerica<Float> obGenericaF=new ClaseGenerica<Float>(100.00F);
        obGenericaF.obtenerTipo();
        
        
        //Creamos una instancia de ClaseGenerica para String
        //Se puede utilizar la inferencia del ripo del lado derecho
        ClaseGenerica<String>generica= new ClaseGenerica<>("Prueba");
        generica.obtenerTipo();
        //Los genericos no pueden ser aplicados a tipos primitivos
        //Por lo que esto marcaria un error de complacion
        //ClaseGenerica<int>claseGenerica= new ClaseGenerica<int>(88);
                
    }
}
