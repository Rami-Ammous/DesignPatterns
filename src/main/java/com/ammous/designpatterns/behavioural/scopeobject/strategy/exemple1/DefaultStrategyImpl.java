package com.ammous.designpatterns.behavioural.scopeobject.strategy.exemple1;

/**
 * @author Rami Ammous
 */
public class DefaultStrategyImpl implements Strategy {
    @Override
    public void operationStrategy() {
        System.out.println("================================");
        System.out.println("============Default Stratégy ==========");
        System.out.println("::::::::::::::::::::::::::::::::");
    }
}
