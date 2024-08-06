package com.ammous.designpatterns.strategy.exemple3.Personnage;

import com.ammous.designpatterns.strategy.exemple3.Strategies.ComportementArme;

/**
 * @author Rami Ammous
 */
public abstract class Personnage {

    protected ComportementArme comportementArme;

    protected  String nom;
    protected  int score;

    public abstract void combattre();


    public void setComportementArme(ComportementArme comportementArme) {
        this.comportementArme = comportementArme;
    }
}
