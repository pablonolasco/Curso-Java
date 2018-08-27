/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema21ManejoArchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author pablo
 */
public class ManejoArchivos {
     //CrearArchivo ruta
    static final File FILE= new File("c:\\license\\archivo.txt");
    public static void main(String[] args) {
      //crearArchivo();
      //agregarInfo();
      leerArchivo();
    }
    static void crearArchivo(){
       
        try {
            //FileWriter se utiliza para escribir en un archivo
            //PrintWriter se utiliza para escribir lineas completas, cuando se crea nuevo el archivo
            PrintWriter salida= new PrintWriter(new FileWriter(FILE));
            salida.close();
            
        } catch (Exception e) {
        }
        System.out.println("El archvio se ha creado correctamente");
    }
    
    static void leerArchivo(){
        try {
            //Se crea ruta variable archivo
           // File file= new File("c:\\license\\archivo.txt");
            //Lectura de informacion
            BufferedReader entrada= new BufferedReader(new FileReader(FILE));
            String lectura;
            lectura=entrada.readLine();
            
            while (lectura !=null) {
                System.out.println("Lectura:"+lectura);
                lectura=entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
    }
    
    static void agregarInfo(){
        try {
            //Se crea variable ruta archivo
            //File file= new File("c:\\license\\archivo.txt");
            //Se pasa al contructor la bandera true, que indica que se va a agregar informacion 
            //al archivo ya existente
            PrintWriter salida= new PrintWriter(new FileWriter(FILE,true));
            
            String contenido="Agregando informacion al archivo";
            //Escribe 
            salida.print(contenido);
            salida.println();
            salida.println("Fin de agregar");
            salida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Se ha anexado la informacion correctamente");
    }
}
