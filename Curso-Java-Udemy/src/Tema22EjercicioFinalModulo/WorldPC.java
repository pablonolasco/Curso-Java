/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema22EjercicioFinalModulo;

import javax.management.monitor.Monitor;

/**
 *
 * @author pablo
 */
public class WorldPC {

    public static void main(String[] args) {

        Computer computer = new Computer("Lenovo", new Display("LG", 40.5), new Keyboard("USB", "Logitech"), new Mouse("USB", "Logitech"), 9000);
        Computer computer2 = new Computer("Lenovo", new Display("LG", 40.5), new Keyboard("USB", "Logitech"), new Mouse("USB", "Logitech"), 9000);

        Order ordern = new Order();
        ordern.addComputer(computer);
        ordern.addComputer(computer2);
        ordern.mostrar();
    }

}
