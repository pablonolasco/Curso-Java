/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema20EntradaSalidaDatos;

import java.io.*;


/**
 *
 * @author pablo
 */
public class Test {
    public static void main(String[] args) {
        String captura;
        //Lee solo un caracter a la vez
        InputStreamReader inputStreamReader= new InputStreamReader(System.in);
        //Canal para leer mas de un caracter por consola
        BufferedReader bInput= new BufferedReader(inputStreamReader);
        try {
            System.out.println("Introduce un dato");
            captura=bInput.readLine();//se podra acceder a mas informacion
            while(captura != null){
                System.out.println("Dato introducido:"+captura);
                captura=bInput.readLine();
            }
        } catch (IOException e ) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
