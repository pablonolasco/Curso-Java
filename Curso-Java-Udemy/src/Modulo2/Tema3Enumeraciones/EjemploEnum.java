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
public class EjemploEnum {
    public static void main(String[] args) {
        System.out.println("Continente "+Continente.AMERICA);
        System.out.println("Continente no de paises "+Continente.AMERICA.getPAIS());
        mostrar(Continente.AFRICA);
        imprimir();
    }
    
    public static void mostrar(Continente continente){
        switch(continente){
            case AFRICA:
                System.out.println("Continente "+Continente.AFRICA);
                System.out.println("Contienente no piases "+continente.getPAIS());
                break;
                default:
                    break;
        }
    }
    
    public static void imprimir(){
        for (Continente continente : Continente.values()) {
            System.out.println(continente+" no paises "+continente.getPAIS());
        }
    }
}
