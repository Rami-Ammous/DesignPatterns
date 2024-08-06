package com.ammous.designpatterns.strategy.exemple3.Personnage;

import com.ammous.designpatterns.strategy.exemple3.Strategies.ComportementHache;
import com.ammous.designpatterns.strategy.exemple3.Strategies.ComportementPoignard;

/**
 * @author Rami Ammous
 */
public class Troll extends Personnage
{

    public Troll() {
        this.comportementArme = new ComportementPoignard();
    }

    @Override
    public void combattre() {
        this.score+=1;
        System.out.println("Je suis une troll...");
        comportementArme.utiliseArme();
        System.out.println("score="+score);
    }
}
