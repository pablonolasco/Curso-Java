/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema22LaboratorioFinal.negocio;

/**
 *
 * @author pablo
 */
public interface CatalogoPeliculas {
    /**
     * Contiene las operaciones necesarias de la aplicacion CatalogoPeliculas
     * @param nombrePelicula
     * @param nombreArchivo 
     */
    public abstract void agregarPelicula(String nombrePelicula,String nombreArchivo);
    public abstract void listarPeliculas(String nombreArchivo);
    public abstract void buscarPelicula(String nombreArchivo,String buscar);
    public abstract void iniciarArchivo(String nombreArchivo);
    
}
