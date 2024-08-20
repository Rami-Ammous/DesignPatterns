package com.ammous.designpatterns.behavioural.scopeobject.strategy.exemple1;

/**
 * @author Rami Ammous
 */
public class Main2 {
    public static void main(String[] args) {

        Context context = new Context();
        context.effectuerOperation();

        context.setStrategy(new StrategyImpl1());   //I njection de dépendance
        context.effectuerOperation();

        context.setStrategy(new StrategyImpl2());
        context.effectuerOperation();

        context.setStrategy(new StrategyImpl3());
        context.effectuerOperation();
    }
}
