/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema18Genericos.Colleciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

/**
 *
 * @author pablo
 */
public class Test {
    public static void main(String[] args) {
        List<String>miList= new ArrayList<>();
        miList.add("1");
        miList.add("2");
        miList.add("3");
        miList.add("4");
        impimir(miList);
        
        Set<String>strings= new HashSet<>();
        strings.add("11");
        strings.add("21");
        strings.add("31");
        strings.add("41");
        impimir(strings);
        
        Map<String,String>miMap= new HashMap<>();
        miMap.put("1", "Pablo");
        miMap.put("2", "Ximena");
        miMap.put("3", "Vianca");
        miMap.put("4", "Alondra");
        impimir(miMap.keySet());
        impimir(miMap.values());
    }
    
    public static void impimir(Collection <String> collection){
        for (String item : collection) {
            System.out.println("Collection:"+item);
        }
        System.out.println("");
        
    }
    
}
