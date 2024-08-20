package com.ammous.designpatterns.behavioural.scopeobject.strategy.exemple3;

import com.ammous.designpatterns.behavioural.scopeobject.strategy.exemple3.Personnage.Personnage;
import com.ammous.designpatterns.behavioural.scopeobject.strategy.exemple3.Personnage.Reine;
import com.ammous.designpatterns.behavioural.scopeobject.strategy.exemple3.Personnage.Roi;
import com.ammous.designpatterns.behavioural.scopeobject.strategy.exemple3.Strategies.ComportementPoignard;

/**
 * @author Rami Ammous
 */
public class Test {

    public static void main(String[] args) {
        Personnage reine = new Reine();
        reine.combattre();
        System.out.println("--------------------");

        Personnage roi = new Roi();
        roi.combattre();
        System.out.println("--------------------");

        roi.setComportementArme(new ComportementPoignard());
        roi.combattre();
        roi.combattre();

    }
}
