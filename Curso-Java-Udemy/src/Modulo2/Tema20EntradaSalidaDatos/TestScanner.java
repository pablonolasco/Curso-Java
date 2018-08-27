/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema20EntradaSalidaDatos;
import java.util.*;
/**
 *
 * @author pablo
 */
public class TestScanner {
    public static void main(String[] args) {
         String captura;
        //Lee solo un caracter a la vez
        Scanner scan= new Scanner(System.in);
        
        try {
            System.out.println("Introduce un dato");
            captura=scan.nextLine();//se podra acceder a mas informacion
            while(captura != null){
                System.out.println("Dato introducido:"+captura);
                captura=scan.nextLine();
            }
        
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
