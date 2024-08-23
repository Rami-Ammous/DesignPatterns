package com.ammous.designpatterns.creational.scopeclass.abstractfactory.exemple1;

/**
 * @author Rami Ammous
 */
public class MacLaptop implements LapTop{

    @Override
    public void make() {
        System.out.println("je suis un MacLaptop");
    }
}
