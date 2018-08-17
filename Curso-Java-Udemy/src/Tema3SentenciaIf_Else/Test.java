/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema3SentenciaIf_Else;

/**
 *
 * @author pablo
 */
public class Test {

    public static void main(String[] args) {
        int num = 10;

        if (num < 20) {
            System.out.println("X menos que 20");
        }

        //if-else
        int x = 30;
        if (x < 20) {
            System.out.println("X menos que 20");

        } else {
            System.out.println("X mayor que 20");

        }

        //if-else if
        int X = 10;

        if (X == 10) {
            System.out.println("X igual a 10");
        }
        if (X == 20) {
            System.out.println("X igual a 20");
        }
        if (X == 30) {
            System.out.println("X igual a 30");
        } else {
            System.out.println("X no es igual a 10, 20, 30");

        }

        mes();
        switch_mes();
    }

    public static void mes() {
        int mes = 2;
        String estacion;

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = ("Invierno");

        } else if (mes == 3 || mes == 4 || mes == 4) {
            estacion = ("Primavera");
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = ("Verano");
        } else if (mes == 9 || mes == 10 || mes == 11 || mes == 4) {
            estacion = ("Otoño");
        } else {
            estacion = ("Mes incorrecto");
        }
        System.out.println("La estacion para el mes " + mes + " es: " + estacion);
    }

    public static void switch_mes() {
        int mes = 4; // Mes del anio
        String estacion;

        String saludo = "Hola Mundo";

        switch (mes) {
            case 1:
            case 2:
            case 12:
                estacion = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Otono";
                break;
            default:
                estacion = "Mes incorrecto";
        }
        System.out.println("La estacion para el mes " + mes + " es: " + estacion);
    }

}
