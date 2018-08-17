/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema20Matrices;
import Tema14Herencia.Persona;
/**
 *
 * @author pablo
 */
public class Test {
    public static void main(String[] args) {
        int matrices [][]= new int[3][2];
                    // 3 renglones y dos columnas
        int enteros[][]={{10,30},{40,12},{10,32}};
        matrices[0][0]=4;
        matrices[0][1]=8;
        matrices[1][0]=12;
        matrices[1][1]=40;
        matrices[2][0]=0;
        matrices[2][1]=4;

        Persona persona[][]={{new Persona("Juan"),new Persona("Ximena"), new Persona("Karla")},{new Persona("Jose"),new Persona("Robert")},{new Persona("Pablo")}};
        
        System.out.println("0-0:"+ matrices[0][0]);
        System.out.println("0-1:"+ matrices[0][0]);
        System.out.println("1-0:"+ matrices[1][0]);
        System.out.println("1-1:"+ matrices[1][1]);
        System.out.println("2-0:"+ matrices[2][0]);
        System.out.println("2-1:"+ matrices[2][1]);
        System.out.println("**********************************");
        
        for (int i = 0; i < matrices.length; i++) {
            System.out.print(i+"[");
            for (int j = 0; j < matrices[i].length; j++) {
                System.out.print(" "+i+":"+j+"="+ enteros[i][j]);
                System.out.print("");
            }
            System.out.println("]");
           
            
        }
        
        for (int i = 0; i < persona.length; i++) {
            System.out.print(i+"[");
            for (int j = 0; j < persona[i].length; j++) {
                System.out.print(i+":"+j+"="+persona[i][j]);
            }
            System.out.println("]");
        }
      
            
    }
}
