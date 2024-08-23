package com.ammous.designpatterns.creational.scopeclass.factorymethod.exemple1;

/**
 * @author Rami Ammous
 */
public class IPhone implements Phone{
    @Override
    public void make() {
        System.out.println("je suis un IPhone");
    }
}
