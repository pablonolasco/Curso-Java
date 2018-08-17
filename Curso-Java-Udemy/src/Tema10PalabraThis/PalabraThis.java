/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema10PalabraThis;

/**
 *
 * @author pablo
 */
public class PalabraThis {
    
    public static void main(String[] args) {
        Persona p= new Persona("Juan");
    }
}
class Persona{
    String nombre;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        Imprimir i= new Imprimir();
        i.Imprimir(this);
    }
    
    
    
}

class Imprimir{
     public void Imprimir(Object o){
         System.out.println("Imprimir parametro:" + o);
         System.out.println("Imprimir this:"+this);
        
         
     }
}
