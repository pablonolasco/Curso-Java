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
public class EjemploEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Valor 1 "+ Dias.LUNES);
        dia(Dias.LUNES);
    }
    
    public static void dia(Dias d){
        switch(d){
            //podemos usar algun valor constante de la enumeracion
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            default:
                break;
        }
    }
}
