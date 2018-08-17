/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema12Encapsulaiento;

/**
 *
 * @author pablo
 */
public class TestPersona {
    public static void main(String[] args) {
        Persona p1= new Persona();
        p1.setNombre("Pablo");
        p1.setApellido("Nolasco");
        p1.setBorrado(false);
        
        Persona p2= new Persona();
        System.out.println(p1);
        System.out.println(p2);
        
    }
    
    public void imprimir(){
        
    }
}
