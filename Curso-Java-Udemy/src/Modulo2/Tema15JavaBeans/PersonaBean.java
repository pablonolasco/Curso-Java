/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema15JavaBeans;

/**
 *
 * @author pablo
 */
//1. Implementa la interface Serilizable del paquete java.io
public class PersonaBean implements java.io.Serializable{
    //2. Cada propiedad es de tipo private
    private String mNombre;
    private int mEdad;
    private boolean mStatus;
    
    //3. Siempre tiene un Constructor sin argumentos
    //Otros constrcutores son opcionales
    public PersonaBean() {
    }

    //Constructor del JavaBean (No requerido)
    public PersonaBean(String mNombre, int mEdad, boolean mStatus) {
        this.mNombre = mNombre;
        this.mEdad = mEdad;
        this.mStatus = mStatus;
    }
    
    
    //4. Por cada propiedad agrega un get y set
    //o solo alguno de ellos si es que no requiere de ambos

    public void setmNombre(String mNombre) {
        this.mNombre = mNombre;
    }

    public String getmNombre() {
        return mNombre;
    }
    public void setmStatus(boolean mStatus) {
        this.mStatus = mStatus;
    }

    public boolean ismStatus() {
        return mStatus;
    }
    
    public int getmEdad() {
        return mEdad;
    }

    public void setmEdad(int mEdad) {
        this.mEdad = mEdad;
    }
    //Continuan los demas métodos. Otros métodos son opcionales
}
