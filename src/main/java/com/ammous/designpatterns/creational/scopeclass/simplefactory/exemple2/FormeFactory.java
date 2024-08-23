package com.ammous.designpatterns.creational.scopeclass.simplefactory.exemple2;

/**
 * @author Rami Ammous
 */
public class FormeFactory {

    public static Forme getForme(String type) {
        switch (type) {
            case "cercle":
                return new Cercle();
            case "carre":
                return new Carre();
            case "rectangle":
                return new Rectangle();

            default:
                throw new IllegalArgumentException("La forme inconnu");
        }

    }
}
