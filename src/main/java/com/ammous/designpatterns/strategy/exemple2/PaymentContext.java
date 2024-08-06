package com.ammous.designpatterns.strategy.exemple2;


/**
 * @author Rami Ammous
 */
public class PaymentContext {

    private PayStrategy payStrategy;

    public void executePayment() {
        if (payStrategy == null) {
            System.err.println("aucun mode de payment n'a ete defini");
            return;
        }
        payStrategy.pay();
    }

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }
}
