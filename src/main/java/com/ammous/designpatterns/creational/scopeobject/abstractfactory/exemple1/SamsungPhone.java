package com.ammous.designpatterns.creational.scopeobject.abstractfactory.exemple1;

/**
 * @author Rami Ammous
 */
public class SamsungPhone implements Phone{

    @Override
    public void make() {
        System.out.println("je suis un SamsungPhone");
    }
}
