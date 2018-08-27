/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema11conversionObjetos;

/**
 *
 * @author pablo
 */
public class Escritor extends Empleado{
    private  final TipoEscritura MESCRITURA;

    public Escritor(String nombre, double sueldo, TipoEscritura escritura) {
        super(nombre, sueldo);
        this.MESCRITURA=escritura;
    }

    public  TipoEscritura getsEscritura() {
        return MESCRITURA;
    }

    public String getsEscrituraEnTexto() {
        return MESCRITURA.getDESCRIPCION();
    }
    
    /*Polimorfismo*/
    @Override
    public String obtenerDetalle(){
        //Aqui se aplica el polimorfismo
        //Se accede al metodo padre con la palabra super
        
        return super.obtenerDetalle()+ ", escritura "+MESCRITURA;
    }

    
    
}
