/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema17ApiColleciones;
import java.util.*;
/**
 *
 * @author pablo
 */
public class Test {
    public static void main(String[] args) {
        //List es una interfaz y necesita de una colleccion con metodos definidos
        List mList= new ArrayList();
        mList.add("1");
        mList.add("2");
        mList.add("Hola");
        mList.add(5);
        //elemento repetido
        mList.add("5");
        
        imprimir(mList);
        
        Set set= new HashSet();
        set.add("100");
        set.add("200");
        set.add("300");
        set.add("400");
        //No permite elementos repetidos, lo ignora
        set.add("400");
        imprimir(set);
        
        //Lllave valor
        Map map= new HashMap();
        map.put("1", "Juan");
        map.put("2", "Ximena");
        map.put("3", "Rosario");
        map.put("4", "Vianca");
        
        //Se imprimen todas las llaves
        imprimir(map.keySet());
        
        //Se imprimen todos los valores
        imprimir(map.values());
    }

    private static void imprimir(Collection values) {
       
        for (Object collection : values) {
            System.out.println("element=>"+collection);
        }
        System.out.println("");
    }
}
