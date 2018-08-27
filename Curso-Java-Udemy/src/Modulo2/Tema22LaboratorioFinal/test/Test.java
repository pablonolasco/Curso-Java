/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema22LaboratorioFinal.test;

import Modulo2.Tema22LaboratorioFinal.negocio.CatalogoPeliculas;
import Modulo2.Tema22LaboratorioFinal.negocio.CatalogoPeliculasImpl;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Test {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String nombreArchivo = "c:\\license\\archivo.txt";
    private static final CatalogoPeliculas catalogoPeli = new CatalogoPeliculasImpl();
    private static  int op = -1;
    public static void main(String[] args) {


        while (op != 0){
       System.out.println("Elige opcion:\n1.- Iniciar catalogo peliculas"
                        + "\n2.- Agregar pelicula\n"
                        + "3.- Listar Peliculas\n"
                        + "4.- Buscar Pelicula\n"
                        + "0.- Salir");
            op = Integer.parseInt(scanner.nextLine());
            switch (op) {
            

                case 1:
                    //1. Creamos el objeto que administra el catalogo de personas
                    //La creacion del archivo es opcional, de todas maneras se creara 
                    //al escribir por primera vez en el archivo
                    catalogoPeli.iniciarArchivo(nombreArchivo);
                    break;
                case 2:
                    //2. agregar informacion archivo
                    System.out.println("Introduce el nombre de una pelicula a agregar:");
                    String nombre = scanner.nextLine();
                    catalogoPeli.agregarPelicula(nombre, nombreArchivo);
                    break;
                case 3:
                    //3. listar catalogo completo
                    catalogoPeli.listarPeliculas(nombreArchivo);
                    break;
                case 4:
                    //4. Buscar pelicula
                    System.out.println("Introduce el nombre de una pelicula a buscar:");
                    String buscar = scanner.nextLine();
                    catalogoPeli.buscarPelicula(nombreArchivo, buscar);
                    break;
                        case 0:
                    System.out.println("!Hasta pronto!");
                    break;
                default:
                    System.out.println("No existe esa opcion");

                    break;

            }
           System.out.println("\n"); 
        }

    }
}
