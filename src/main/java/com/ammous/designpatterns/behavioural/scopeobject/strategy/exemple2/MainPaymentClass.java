package com.ammous.designpatterns.behavioural.scopeobject.strategy.exemple2;

/**
 * @author Rami Ammous
 */
public class MainPaymentClass {
    public static void main(String[] args) {

        PaymentContext paymentContext = new PaymentContext();
        paymentContext.executePayment();

        paymentContext.setPayStrategy(new CashPayment());
        paymentContext.executePayment();

        paymentContext.setPayStrategy(new CreditCardPayment());
        paymentContext.executePayment();
    }
}
