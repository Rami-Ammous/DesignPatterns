package com.ammous.designpatterns.creational.scopeclass.factory.exemple1;

/**
 * @author Rami Ammous
 */
public class FactoryMain {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc");
        System.out.println(pc);

        Computer server = ComputerFactory.getComputer("server");
        System.out.println(server);

       /* Computer introuvable = ComputerFactory.getComputer("introuvable");
        System.out.println(introuvable);*/

        Computer imaginaire = ComputerFactory.getComputer("imaginaire");
        System.out.println(imaginaire);
    }
}
