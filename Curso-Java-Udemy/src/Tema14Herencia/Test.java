/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema14Herencia;

/**
 *
 * @author pablo
 */
public class Test {
    public static void main(String[] args) {
       
        Empleado e= new Empleado("Pablo", 150000);
        System.out.println("Empleado " +e.getNombre());
         
        System.out.println(e);
       
        Empleado e1= new Empleado("Pedro", 80000);
        e1.setEdad(29);
        e1.setGenero('M');
        e1.setDireccion("Mexico");
        System.out.println("Empleado "+e.getNombre());
        System.out.println(e1);
        
        Cliente c= new Cliente(new java.util.Date(), false);
        System.out.println("Cliente ");
        System.out.println(c);
        
        c.setNombre("Ximena");
        c.setEdad(28);
        c.setGenero('F');
        c.setDireccion("Mexico");
        System.out.println("Cliente " +c.getNombre());
        System.out.println(c);
        
        
        
        
    }
    
}
