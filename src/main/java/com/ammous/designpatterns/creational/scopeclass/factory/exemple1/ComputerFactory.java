package com.ammous.designpatterns.creational.scopeclass.factory.exemple1;

/**
 * @author Rami Ammous
 */
public class ComputerFactory {

    public static Computer getComputer(String type) {
        switch (type) {

            case "pc" : return new Pc("8Go","1To SATA","2.3 Ghz");

            case "gamer" : return new PcGamer("32Go","2To SSD","4.0 Ghz");

            case "server" : return new Serveur("128Go","8To SSD","6.0 Ghz");

            case "imaginaire" : return new Serveur("1Go","100To SATA","6.0 Ghz");

            default:  throw new IllegalArgumentException("ce type de Pc n'existe pas encore");
        }

    }
}