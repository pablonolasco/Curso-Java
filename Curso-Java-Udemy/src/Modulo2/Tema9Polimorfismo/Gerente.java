/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema9Polimorfismo;

import Modulo2.Tema8Sobreescitura.*;

/**
 *
 * @author pablo
 */
public class Gerente extends Empleado{
    private String departamento;

    public Gerente(String nombre, double sueldo,String departamento) {
        super(nombre, sueldo);
        this.departamento=departamento;
    }
    

    /*Polimorfismo*/
    @Override
    public String obtenerDetalle(){
        //Aqui se aplica el polimorfismo
        //Se accede al metodo padre con la palabra super
        
        return super.obtenerDetalle()+ departamento +" departamento";
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
}
