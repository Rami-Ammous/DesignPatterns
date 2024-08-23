package com.ammous.designpatterns.creational.scopeclass.abstractfactory.exemple1;

/**
 * @author Rami Ammous
 */
public class SamsungFactory implements AbstractFactory{

    @Override
    public Phone makePhone() {
        return new SamsungPhone();
    }

    @Override
    public LapTop makeLapTop() {
        return new SamsungLaptop();
    }
}
