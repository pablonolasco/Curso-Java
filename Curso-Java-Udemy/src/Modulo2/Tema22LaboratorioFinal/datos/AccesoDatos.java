/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2.Tema22LaboratorioFinal.datos;
import Modulo2.Tema22LaboratorioFinal.domain.Pelicula;
import Modulo2.Tema22LaboratorioFinal.excepciones.AccesoDatosEx;
import Modulo2.Tema22LaboratorioFinal.excepciones.EscrituraDatosEx;
import Modulo2.Tema22LaboratorioFinal.excepciones.LecturaDatosEx;
import java.util.List;
/**
 *
 * @author pablo
 */
public interface AccesoDatos {
   /**
    * Contiene las operaciones a ejecutar en el archivo de peliuclas.txt
    * Interfaz para manejar datos, desde la creacion, lectura y escritura
    * @param archivo
    * @return 
    */
    public abstract boolean existe(String archivo) throws AccesoDatosEx;
    public abstract List<Pelicula> listar(String nombre)throws LecturaDatosEx;
    public abstract void escibir(Pelicula pelicula, String nombre, boolean  anexar) throws EscrituraDatosEx;
    public abstract String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;
    public abstract void crear(String nombreArchivo) throws AccesoDatosEx;
    public abstract void borrar(String nombreArchivo) throws AccesoDatosEx;
    
   
   
}
