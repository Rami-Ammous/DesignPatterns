package com.ammous.designpatterns.creational.scopeclass.simplefactory.exemple1;

/**
 * @author Rami Ammous
 */
public class Samsung implements Phone{

    @Override
    public void make() {
        System.out.println("je suis un Samsung");
    }
}
