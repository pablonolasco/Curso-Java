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
public class Producto {
    private int idProduct;
    private String name;
    private double price;
    private static int contadorProducto;

    private Producto() {
        this.idProduct=++contadorProducto;
    }
    
    public Producto(String name, double price) {
       //Manda a llamar al constructor
        this();
        this.name = name;
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProduct=" + idProduct + ", name=" + name + ", price=" + price + '}';
    }
    
    
    
}
