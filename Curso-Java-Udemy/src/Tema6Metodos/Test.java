/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema6Metodos;

/**
 *
 * @author pablo
 */
public class Test {
    public static void main(String[] args) {
        Aritmetica aritmetica= new Aritmetica();
        Aritmetica2 aritmetica2= new Aritmetica2(8, 8);
        int res, res2;
        res=aritmetica.suma(5, 5);
        res2=aritmetica2.sumar();
        System.out.println("Suma: "+res);
        System.out.println("Suma 2: "+res2);
    }
}
