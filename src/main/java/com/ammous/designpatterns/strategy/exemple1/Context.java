package com.ammous.designpatterns.strategy.exemple1;

/**
 * @author Rami Ammous
 */
public class Context {

    private Strategy strategy = new DefaultStrategyImpl();

    public void  effectuerOperation() {
        System.out.println("*************************");
        strategy.operationStrategy();
        System.out.println("=========================");
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
