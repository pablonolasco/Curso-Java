/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema7ModificadoresAcceso1;

/**
 *
 * @author pablo
 */
public class Clase1 {
    //Definicion de atributos
    public int atrPublico=5;
    protected int atrProtected=6;
    int atrPaquete=7;
    private int atrPrivado=8;

    public Clase1() {
    }
    public Clase1(int i) {
        System.out.println("Constructor publico");
    }
    
     protected Clase1(int i, int j) {
        System.out.println("Constructor protected");
    }
     
    Clase1(int i, int j, int k){
        System.out.println("Connstructor package 3");
    }
    
    private Clase1(int i, int j, int k, int l){
        System.out.println("Constructor privado");
    }

    public int metdoPublic() {
        return 7;
    }
    protected int metdoProtected() {
        return 8;
    }
    public int metdoPaquete() {
        return 9;
    }
    private int metdoPrivado() {
        return 10;
    }

    
    
    
    
}
