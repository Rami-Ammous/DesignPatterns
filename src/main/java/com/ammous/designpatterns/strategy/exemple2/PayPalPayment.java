package com.ammous.designpatterns.strategy.exemple2;

/**
 * @author Rami Ammous
 */
public class PayPalPayment implements PayStrategy{

    @Override
    public void pay() {
        System.out.println("le mode de payment est le PayPalPayment");
    }

}
