package com.ammous.designpatterns.behavioural.scopeobject.strategy.exemple3.Strategies;

/**
 * @author Rami Ammous
 */
public class ComportementPoignard implements ComportementArme {
    @Override
    public void utiliseArme() {
        System.out.println("Je combat en utilisant un poignard");

    }
}
