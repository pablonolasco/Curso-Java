/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema4BloquesAnonimos;

/**
 *
 * @author pablo
 */
public class Persona {
    private final int ID_PERSONA;
    private static int contadorPersona;
    
    /**
     * Este bloque se ejecuta primero antes que los bloques anonimos
     * ya que tiene la palabra static, y eso le da privilegio de ejecucion
     */
    static {
        //Solo se permiten variables static
        System.out.println("Ejecuta bloque estatico");
        //Iniciamos la variable con 10
        contadorPersona=10;
                
    }
    
    /**
     * Bloque que inicializa con un valor la variable, este metodo se ejecuta 
     * primero antes que las variables staticas y los constructores
     * El bloque se copia a cada constructor de la clase
     * @param ID_PERSONA
     */
    {
        System.out.println("Ejecuta bloque inicializador");
        //Asignar valor a la variable, incrementabdo el contador
        ID_PERSONA=++contadorPersona;
    }
    
    public Persona() {
    }

    public int getID_PERSONA() {
        return ID_PERSONA;
    }
    
}
