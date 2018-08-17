/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema21DisenioClases;

/**
 *
 * @author pablo
 */
public class Ventas {
    public static void main(String[] args) {
        
        Producto p1=new Producto("PEPSI", 10);
        Producto p2=new Producto("PASTA DE DIENTES", 30);
        Producto p3=new Producto("SABRITAS", 9);
        Producto p4= new Producto("PALETA", 4);
        Orden orden= new Orden();
        orden.addProduct(p1);
        orden.addProduct(p2);
        orden.addProduct(p3);
        orden.addProduct(p4);
        
        orden.mostrarOrden();
    }
}
