/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema22LaboratorioFinal.negocio;

import Modulo2.Tema22LaboratorioFinal.datos.AccesoDatos;
import Modulo2.Tema22LaboratorioFinal.datos.AccesoDatosImp;
import Modulo2.Tema22LaboratorioFinal.domain.Pelicula;
import Modulo2.Tema22LaboratorioFinal.excepciones.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author pablo
 */
public class CatalogoPeliculasImpl implements Serializable, CatalogoPeliculas{

    private final AccesoDatos accesoDatos;
    
    public CatalogoPeliculasImpl() {
         this.accesoDatos= new AccesoDatosImp();
    }
    
    
    
    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
        Pelicula pelicula= new Pelicula(nombrePelicula);
        boolean anexar=false;
        try {
            anexar=accesoDatos.existe(nombreArchivo);
            accesoDatos.escibir(pelicula, nombreArchivo, anexar);
        } catch (AccesoDatosEx e) {
            System.err.println("Error de acceso de datos");
            e.printStackTrace();
        }
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
         try {
            List<Pelicula> peliculas = accesoDatos.listar(nombreArchivo);
            for (Pelicula pelicula : peliculas) {
                System.out.println("Pelicula:" + pelicula);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        String resultado = null;
        try {
            resultado = accesoDatos.buscar( nombreArchivo,buscar);
        } catch (LecturaDatosEx ex) {
            System.out.println("Error al buscar la pelicula");
            ex.printStackTrace();
        }
        System.out.println("Resultado busqueda:" + resultado);
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
         try {
            if (accesoDatos.existe(nombreArchivo)) {
                accesoDatos.borrar(nombreArchivo);
                accesoDatos.crear(nombreArchivo);
            } else {
                //creamos archivo
                accesoDatos.crear(nombreArchivo);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
    }
    
}
