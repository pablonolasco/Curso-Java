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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author pablo
 */
public class AccesoDatosImp implements Serializable, AccesoDatos {

    public AccesoDatosImp() {
    }

    @Override
    public boolean existe(String archivo) throws AccesoDatosEx {
        File sFile = new File(archivo);
        return sFile.exists();
    }

    @Override
    public List<Pelicula> listar(String nombre) throws LecturaDatosEx {
        File sFile = new File(nombre);
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(sFile));
            String linea = null;
            linea = entrada.readLine();
            while (linea != null) {
                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return peliculas;
    }

    @Override
    public void escibir(Pelicula pelicula, String nombre, boolean anexar) throws EscrituraDatosEx {
        try {
            File sFile = new File(nombre);
            PrintWriter salida = new PrintWriter(new FileWriter(nombre, anexar));
            salida.println(pelicula);
            salida.println();
            salida.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
        File sFile = new File(nombreArchivo);
        String resultado = null;
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(sFile));
            String linea = null;
            int i = 0;

            linea = entrada.readLine();

            while (linea != null) {
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                    resultado = "Pelicula " + linea + " enonctrado en el indice " + i;
                    break;
                }
                linea = entrada.readLine();
                i++;
            }
            entrada.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {

        try {
            File sFile = new File(nombreArchivo);
            PrintWriter printWriter = new PrintWriter(new FileWriter(sFile));
            printWriter.close();
            System.out.println("Se ha creado el archivo correctamente");

        } catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {
        File sFile = new File(nombreArchivo);
        sFile.delete();
        System.out.println("Se ha eliminado el archivo correctamente");
    }

}
