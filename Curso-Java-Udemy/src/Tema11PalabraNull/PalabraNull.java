/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema11PalabraNull;

/**
 *
 * @author pablo
 */
public class PalabraNull {
    public static void main(String[] args) {
        Persona p= new Persona("Juan");
        
        Persona p2=p;
        
        System.out.println("p:"+p.getNombre());
        System.out.println("p2:"+p2.getNombre());
        
        p=null;
        
        System.out.println("p2:"+p2.getNombre());
        
        if(p != null)
        System.out.println("Valor nulo p"+p.getNombre());
    }
}

class Persona{
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
