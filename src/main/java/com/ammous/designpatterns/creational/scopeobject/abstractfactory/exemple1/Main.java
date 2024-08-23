package com.ammous.designpatterns.creational.scopeobject.abstractfactory.exemple1;

/**
 * @author Rami Ammous
 */
public class Main {
    public static void main(String[] args) {

        Phone samsungPhone = new SamsungFactory().makePhone();
        samsungPhone.make();

        System.out.println("-------------------------");

        LapTop samsungLapTop = new SamsungFactory().makeLapTop();
        samsungLapTop.make();

    }
}
