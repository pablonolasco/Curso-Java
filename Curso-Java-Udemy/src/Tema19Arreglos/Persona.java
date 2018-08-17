/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema19Arreglos;

/**
 *
 * @author pablo
 */
public class Persona {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    private String name;
    private String appaterno;

    public Persona(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + '}';
    }
    
    
    
    
}
