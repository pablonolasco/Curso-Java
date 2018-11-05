/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseDosVariables;

/**
 *
 * @author FREEDSDesarrollador
 */
public class Test {
    public static void main(String[] args) {
       //Variables
       byte bit=1;
       short sh=8293;
       int edad=37;//037octal,  1.82e20, uno 82 exponente 20
       long enteroLargo=129L;
       char caracter='@';
       float flotante=34F;
       double doble=23.4D;
       boolean bandera=false;
       double resultado;
       resultado=flotante-doble;
       resultado=(double)edad/2;
       int acumulador=0;
       acumulador+=((double)resultado/2);
       acumulador*=(resultado/2);
       boolean result;
       result=bandera && true;
       result=bandera || true;
       result=bandera & true;
       System.out.println("R="+resultado);
       System.out.println("Acumulador="+acumulador);
       System.out.println("V="+result);
       //Formula gravedad f= g m1*m2/r2
       double fuerza;
       final double GRAVEDAD=6.67e-11;
       double m1=5.97e24;
       double m2=1.98e30;
       long distancia= 149600000L;
       
       // fuerza=(GRAVEDAD*m1*m2)/Math.pow(distancia, distancia);
       fuerza=(GRAVEDAD*m1*m2)/(distancia * distancia);
       System.out.println("La fuerza con la que se atrae el sol y la tierra es de="+fuerza+ "d "+(++distancia));
       
       
        
    }
}
