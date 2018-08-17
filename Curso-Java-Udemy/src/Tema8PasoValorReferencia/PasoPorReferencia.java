/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema8PasoValorReferencia;

/**
 *
 * @author pablo
 */
public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona p= new Persona();
        p.nombre="Pablo";
        imprimirNombre(p);
        modificarPersona(p);
        imprimirNombre(p);
    }
    public static void modificarPersona(Persona arg){
        arg.nombre="Pedro";
    }
    
    public static void imprimirNombre(Persona p){
       p.desplegar();
    }
    
}
