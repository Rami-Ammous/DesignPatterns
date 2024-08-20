package com.ammous.designpatterns.creational.scopeclass.factory.exemple2;

/**
 * @author Rami Ammous
 */
public class MainFactory {
    public static void main(String[] args) {
        Forme cercle =  FormeFactory.getForme("cercle");
        cercle.dessiner();

        Forme rectangle =  FormeFactory.getForme("rectangle");
        rectangle.dessiner();

        Forme carre =  FormeFactory.getForme("carre");
        carre.dessiner();
    }
}
