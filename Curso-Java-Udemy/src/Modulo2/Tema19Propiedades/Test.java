/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema19Propiedades;
import java.util.*;
/**
 *
 * @author pablo
 */
public class Test {
    public static void main(String[] args) {
        //Obtienes las propiedades del sistema
     
        Properties properties= System.getProperties();
        Enumeration nombrePropierties=properties.propertyNames();
        
        while (nombrePropierties.hasMoreElements()) {
            
            String nombrePropiedad =(String) nombrePropierties.nextElement();
            String valorProString =properties.getProperty(nombrePropiedad);
            System.out.println("Llave: "+nombrePropiedad+"="+valorProString);
            
        }
    }
            
}
