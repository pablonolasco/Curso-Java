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
public class Test {
    public static void main(String[] args) {
        PersonaBean bean= new PersonaBean();
        bean.setmNombre("Pablo");
        bean.setmEdad(27);
        bean.setmStatus(true);
        System.out.println(bean.getmNombre());
        System.out.println(bean.getmEdad());
        System.out.println(bean.ismStatus());
        
    }
    
}
