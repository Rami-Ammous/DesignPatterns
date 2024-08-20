package com.ammous.designpatterns.behavioural.scopeobject.strategy.exemple3.Personnage;

import com.ammous.designpatterns.behavioural.scopeobject.strategy.exemple3.Strategies.ComportementArcEtFleche;
import com.ammous.designpatterns.behavioural.scopeobject.strategy.exemple3.Strategies.ComportementHache;

/**
 * @author Rami Ammous
 */
public class Reine extends Personnage {

    public Reine() {
        this.comportementArme = new ComportementArcEtFleche();
    }

    @Override
    public void combattre() {
        score+=4;
        System.out.println("Je suis une reine...");
        comportementArme.utiliseArme();
        System.out.println("score="+score);
        if(score>15)  this.comportementArme = new ComportementHache();

    }
}
