package com.ammous.designpatterns.creational.scopeclass.abstractfactory.exemple1;

/**
 * @author Rami Ammous
 */
public class SamsungPhone implements Phone{

    @Override
    public void make() {
        System.out.println("je suis un SamsungPhone");
    }
}
