package com.ammous.designpatterns.creational.scopeclass.factorymethod.exemple1;

/**
 * @author Rami Ammous
 */
public class Main {
    public static void main(String[] args) {

        Phone samsung = new SamsungFactory().makePhone();
        samsung.make();
        System.out.println("----------------------");
        Phone iphone = new IPhoneFactory().makePhone();
        iphone.make();
    }
}
