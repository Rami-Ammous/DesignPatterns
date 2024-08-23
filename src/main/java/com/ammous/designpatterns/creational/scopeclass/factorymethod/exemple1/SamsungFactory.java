package com.ammous.designpatterns.creational.scopeclass.factorymethod.exemple1;

/**
 * @author Rami Ammous
 */
public class SamsungFactory implements AbstractFactory {

    @Override
    public Phone makePhone() {
        return  new Samsung();
    }
}
