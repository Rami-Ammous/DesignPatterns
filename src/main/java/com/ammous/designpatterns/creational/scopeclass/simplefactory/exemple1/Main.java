package com.ammous.designpatterns.creational.scopeclass.simplefactory.exemple1;

/**
 * @author Rami Ammous
 */
public class Main {
    public static void main(String[] args) {

        PhoneFactory phoneFactory = new PhoneFactory();

        //make Samsung
        Phone samsung = phoneFactory.makePhone("samsung");
        samsung.make();

        System.out.println("-----------------------");

        //make IPhone
        Phone iphone = phoneFactory.makePhone("IPHONE");
        iphone.make();
    }
}
