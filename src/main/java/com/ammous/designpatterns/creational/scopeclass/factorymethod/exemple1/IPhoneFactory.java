package com.ammous.designpatterns.creational.scopeclass.factorymethod.exemple1;

/**
 * @author Rami Ammous
 */
public class IPhoneFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new IPhone();
    }
}
