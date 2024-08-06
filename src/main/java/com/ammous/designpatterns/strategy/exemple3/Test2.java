package com.ammous.designpatterns.strategy.exemple3;

import com.ammous.designpatterns.strategy.exemple3.Personnage.Personnage;
import com.ammous.designpatterns.strategy.exemple3.Personnage.Reine;
import com.ammous.designpatterns.strategy.exemple3.Personnage.Roi;
import com.ammous.designpatterns.strategy.exemple3.Strategies.ComportementPoignard;

/**
 * @author Rami Ammous
 */
public class Test2 {

    public static void main(String[] args) {
        Personnage reine = new Reine();
        reine.combattre();
        System.out.println("--------------------");
        reine.combattre();
        System.out.println("--------------------");
        reine.combattre();
        System.out.println("--------------------");
        reine.combattre();
        System.out.println("--------------------");
        reine.combattre();
        System.out.println("--------------------");



    }
}
