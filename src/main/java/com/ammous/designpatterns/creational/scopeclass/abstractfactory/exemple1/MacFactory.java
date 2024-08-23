package com.ammous.designpatterns.creational.scopeclass.abstractfactory.exemple1;

/**
 * @author Rami Ammous
 */
public class MacFactory implements AbstractFactory{

    @Override
    public Phone makePhone() {
        return new MacPhone();
    }

    @Override
    public LapTop makeLapTop() {
        return new MacLaptop();
    }
}
