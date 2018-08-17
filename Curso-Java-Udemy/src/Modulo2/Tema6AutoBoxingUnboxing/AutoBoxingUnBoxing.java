/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema6AutoBoxingUnboxing;

/**
 *
 * @author pablo
 */
public class AutoBoxingUnBoxing {
    public static void main(String[] args) {
        //Autoboxing se convierten de tipos primitivos a tipo object, wraper
        Integer enteroObj=10;
        Float floatObj=15.2F;
        Double doubleObj=40.1;
        //Retorna el tipo primitivo que contiene envuelto
        System.out.println("AutoBoxing");
        System.out.println("Entero "+enteroObj.intValue());
        System.out.println("Flotante "+floatObj.floatValue());
        System.out.println("Double "+doubleObj.doubleValue());
        
        //AutoUnboxing se convierte de objetos a tipos primitivos
        int entero=enteroObj;
        float f=floatObj;
        double d=doubleObj;
        System.out.println("\nUnBoxing");
        System.out.println("Entero "+entero);
        System.out.println("Flotante "+f);
        System.out.println("Double "+d);
        
        
        
        
        
    }
}
