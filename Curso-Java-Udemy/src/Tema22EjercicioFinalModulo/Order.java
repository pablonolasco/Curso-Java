/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema22EjercicioFinalModulo;

import com.sun.org.glassfish.gmbal.Description;
import java.util.logging.Logger;

/**
 *
 * @author pablo
 */
public class Order {
    private int idOrden;
    private static int contadorOrden;
    private int contadorComputer;
    private final Computer listComputer[];
    private final static int maximoComputadoras=10;

    public Order() {
        this.idOrden=++contadorOrden;
        this.listComputer= new Computer[maximoComputadoras];
    }
    
    public void addComputer(Computer computer){
        if (contadorComputer < maximoComputadoras) {
           this.listComputer[contadorComputer++]=computer;
        } else {
            System.err.println("Llego al maximo de computadoras");
        }
    }
    /**
     *@return retorna la suma de los elementos
     */
    public double calcTotal(){
        double total=0;
        
        for (Computer computer : listComputer) {
            if (computer != null) {
               total+=computer.getPrecio();    
            }else{
                break;
            }
            
            
        }
        
        return total;
    }
    
    public void mostrar(){
        System.out.println("Orden:"+this.idOrden);
        System.out.println("Total Venta:"+this.calcTotal());
        System.out.println("Total Computadoras:"+this.contadorComputer);
        System.out.println("Detalle Computadoras:");
        for (Computer computer : listComputer) {
            if(computer != null)
                System.out.println(computer);
            else
                break;
        }
    }
    
    
}
