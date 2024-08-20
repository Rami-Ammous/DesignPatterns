package com.ammous.designpatterns.behavioural.scopeobject.strategy.exemple2;

/**
 * @author Rami Ammous
 */
public class CashPayment implements PayStrategy{

    @Override
    public void pay() {
        System.out.println("le mode de payment est le CashPayment");
    }
}
