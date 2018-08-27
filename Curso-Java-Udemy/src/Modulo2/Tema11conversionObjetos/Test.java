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
public class Test {

    public static void main(String[] args) {
        //1. Creamos un tipo de mas alta jerarquia
        Empleado empleado;
        //Asignamos una referencia de un objeto de menor jerarquia
        //Esto es UPCASTING, no hay necesidad de una notacion especial
        //UPPCASTING de menor jerarquia a mayor
        empleado = new Escritor("Roy", 15000, TipoEscritura.MODERNA);
        //Sin embargo si quisieramos acceder al detalle de la clase Escritor
        //No es posible, ya que esas caracteristicas no están en comun
        //entre todas las clases de la jerarquia de clases
        //emp.getTipoDeEscrituraEnTexto();
        //Imprimimos los detalles en un metodo generico
        imprimirDetalles(empleado);
        //2. Podemos hacer lo mismo con la clase Gerente
        //Esto es upcasting, por lo que no requiere una sintaxis especial
        empleado = new Gerente("Laura", 18000, "Sistemas");
        //Pero si queremos acceder directo por la variable empleado
        //al detalle del objeto Gerente no es posible, se pierde el acceso
        //empleado.getDepartamento();
        //Utilizamos el mismo metodo para imprimir los detalles
        imprimirDetalles(empleado);
    }

    //Metodo generico para imprimir los detalles de la jerarquia Empleado
    private static void imprimirDetalles(Empleado empleado) {
        String resultado = null;
        //Imprimir detalles es general para todos ya que es por polimorfimo
        //no se necesita de ninguna conversion
        //Imprime el metodo sobreescrito de Escritor o Gerente por el polimorfismo
        //dependiendo el tipo de referencia que tenga el objeto
        System.out.println("\nDetalle:" + empleado.obtenerDetalle());
        //Pero los detalles de cada clase debemos hacer un downcasting
        if (empleado instanceof Escritor) {
            //Convertimos el objeto al tipo inferior deseado
            //Convierte objeto - Downcasting
            //DOWNCASTING de mayor jerarquia a menor
            Escritor escritor = (Escritor) empleado;
            //Finalmente podemos acceder a los metodos de la clase Escritor
            resultado = escritor.getsEscrituraEnTexto();
            //Otra forma es hacer la conversion en la misma linea de codigo.
            //Esto es muy compun encontrarlo en Java
            //para evitar la creacion de variables innecesarias
            resultado = ((Escritor) empleado).getsEscritura().getDESCRIPCION();
            System.out.println("resultado tipoEscritura:" + resultado);
        } else if (empleado instanceof Gerente) {
            //Hacemos el downcasting en la misma linea de codigo
            //nos ahorramos una variable
            resultado=((Gerente)empleado).getDepartamento();
            System.out.println("resultado departamento "+ resultado);
        }
    }
}
