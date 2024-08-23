package com.ammous.designpatterns.creational.scopeobject.abstractfactory.exemple1;

/**
 * @author Rami Ammous
 */
public class SamsungLaptop implements LapTop{

    @Override
    public void make() {
        System.out.println("je suis un SamsungLaptop");
    }
}
