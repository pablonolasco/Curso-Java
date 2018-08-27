/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema10InstanceOf;

/**
 *
 * @author pablo
 */
public class Test {

    public static void main(String[] args) {
        FiguraGeometrica figura;
        figura = new Elipse();
        //Instance of solo retorna el valor en tiempo de ejecucion
        //Determina solo un tipo el que corresponda con la jerarquia
        System.out.println("Devuelve el objeto a que pertence");
        determinaTipo(figura);
        //Determina todos los tipos posibles
        System.out.println("Busca en todos los tipos");
        determinaTodoslosTipos(figura);
    }

    /**
     * Busca en cada bloque el tipo de objeto
     */
    static void determinaTodoslosTipos(FiguraGeometrica figuraGeometrica) {

        if (figuraGeometrica instanceof Rectangulo) {
            //Procesa algo particular del Rectangulo
            System.out.println("Es una Rectangulo");
        }

        if (figuraGeometrica instanceof Cuadrado) {
            //Procesa algo particular del Cuadrado
            System.out.println("Es un Cuadrado");
        }

        if (figuraGeometrica instanceof Circulo) {
            //Procesa algo particular del Circulo
            System.out.println("Es un Circulo");
        }

        if (figuraGeometrica instanceof Elipse) {
            //Procesa algo particular de la Elipse
            System.out.println("Es una Elipse");
        }

        if (figuraGeometrica instanceof FiguraGeometrica) {
            //Procesa algo particular de la Figura Geometrica
            System.out.println("Es una Figura Geometrica");
        }
        if (figuraGeometrica instanceof Object) {
            //Procesa algo particular de la clase Object
            System.out.println("Es un Object");
        } else {
            System.out.println("No se encontró el tipo");
        }

    }

    /**
     * TODO Metodo que regresa a que tipo de objeto pertenece cuando busca en un
     * bloque y pertenece, en ese momento termina la busqueda sin ingresar a
     * cada bloque if
     *
     * @param figuraGeometrica
     */
    static void determinaTipo(FiguraGeometrica figuraGeometrica) {
        if (figuraGeometrica instanceof Rectangulo) {
            //Procesa algo particular del Rectangulo
            System.out.println("Es una Rectangulo");
        } else if (figuraGeometrica instanceof Cuadrado) {
            //Procesa algo particular del Cuadrado
            System.out.println("Es un Cuadrado");
        } else if (figuraGeometrica instanceof Circulo) {
            //Procesa algo particular del Circulo
            System.out.println("Es un Circulo");
        } else if (figuraGeometrica instanceof Elipse) {
            //Procesa algo particular de la Elipse
            System.out.println("Es una Elipse");
        } else if (figuraGeometrica instanceof Object) {
            //Procesa algo particular de la Elipse
            System.out.println("Es un Object");
        } else {
            System.out.println("No coincide con ningun tipo");
        }
    }

}
