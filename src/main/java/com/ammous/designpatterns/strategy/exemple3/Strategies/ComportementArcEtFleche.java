package com.ammous.designpatterns.strategy.exemple3.Strategies;

/**
 * @author Rami Ammous
 */
public class ComportementArcEtFleche implements ComportementArme {
    @Override
    public void utiliseArme() {
        System.out.println("Je combat en utilisant un arc et fleche");

    }
}
