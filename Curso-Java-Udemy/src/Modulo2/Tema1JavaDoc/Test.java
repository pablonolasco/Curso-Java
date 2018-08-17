/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema1JavaDoc;

/**
 * Clase para probar el concepto de JavaDoc
 * @author pablo
 * @version 1.0
 */
public class Test {
    
    /**
     * Generar JavaDoc, clic derecho sobre el proyecto -> generar javadoc
     * Metodo que ejecuta la prueba de la clase Aritmetica
     * @param args  argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        int res= new Aritmetica(5, 10).sumar();
        System.out.println("Resultado:"+res);
    }
}
