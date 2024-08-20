package com.ammous.designpatterns.behavioural.scopeobject.strategy.exemple3.Personnage;

import com.ammous.designpatterns.behavioural.scopeobject.strategy.exemple3.Strategies.ComportementHache;

/**
 * @author Rami Ammous
 */
public class Roi extends Personnage {

    public Roi() {
        this.comportementArme = new ComportementHache();
    }

    @Override
    public void combattre() {
        this.score+=2;
        System.out.println("Je suis un roi...");
        this.comportementArme.utiliseArme();
        System.out.println("score="+score);

    }
}
