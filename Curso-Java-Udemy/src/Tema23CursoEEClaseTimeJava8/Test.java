/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema23CursoEEClaseTimeJava8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 *
 * @author pablo
 */
public class Test {
    public static void main(String[] args) {
        
        usarNow();
        usarOf();
    }
    
    static void usarOf(){
        LocalDate date=LocalDate.of(2018, Month.SEPTEMBER, 4);
        LocalTime time=LocalTime.of(14, 10, 10);
        LocalDateTime dateTime= LocalDateTime.of(date, time);
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
    }
    
    public static void usarNow(){
        LocalDate fecha= LocalDate.now();
        LocalTime tiempoActual=LocalTime.now();
        LocalDateTime fechaTiempoAQctual=LocalDateTime.now();
        System.out.println("Fechas "+fecha+", "+tiempoActual+", "+fechaTiempoAQctual);
    }
    
}
