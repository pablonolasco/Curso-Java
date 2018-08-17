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
public class Orden {
    private final int idOrden;
    private final Producto listProducts[];
    private static int contadorOrden;
    private int contadorProductos;
    private static final int maxProducts=4;
    
    public Orden() {
        this.idOrden = ++contadorOrden;
        this.listProducts = new Producto[maxProducts];
    }
    
   
   public boolean addProduct(Producto product){
       boolean flag=false;
       try {
           //Valida que el contador sea menor al maximo de productos a agregar
           if (contadorProductos < maxProducts) {
               
               listProducts[contadorProductos++]=product;
           } else {
               System.out.println("Se ha superado el maximo de productos "+maxProducts);
           }
       } catch (Exception e) {
           System.err.println("Ocurrior un error:"+e.getMessage());
       }
       
       return flag;
       
   }
   
   public double calcTotal(){
       double preci=0;
       try {
           for (int i = 0; i < listProducts.length; i++) {
               preci+=listProducts[i].getPrice();
           }
       } catch (Exception e) {
           
       }
       
       return preci;
   }
   
   public void mostrarOrden(){
       System.out.println("Orden :"+idOrden);
       System.out.println("Total Venta :"+this.calcTotal());
       System.out.println("Orden :"+idOrden);
       System.out.println("Productos Ordenados :");
       for (Producto listProduct : listProducts) {
           System.out.println(listProduct);
       }
   }
    
    
}

