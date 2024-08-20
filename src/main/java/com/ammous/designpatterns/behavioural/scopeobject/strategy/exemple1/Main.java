package com.ammous.designpatterns.behavioural.scopeobject.strategy.exemple1;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

/**
 * @author Rami Ammous
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Context context = new Context();
        /*context.effectuerOperation();

        context.setStrategy(new StrategyImpl1());   //I njection de dépendance
        context.effectuerOperation();

        context.setStrategy(new StrategyImpl2());
        context.effectuerOperation();

        context.setStrategy(new StrategyImpl3());
        context.effectuerOperation();*/

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Quelle strategie ?");
            String str = scanner.nextLine();
            Strategy strategy = null;
            try {
                strategy = (Strategy)
                        Class.forName("com.ammous.designpatterns.strategy.exemple1.StrategyImpl"+str).getConstructor().newInstance();
                    context.setStrategy(strategy);
            } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException e) {
                context.setStrategy(new DefaultStrategyImpl());
            }

            context.effectuerOperation();
        }
    }

}