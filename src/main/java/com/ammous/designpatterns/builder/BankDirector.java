package com.ammous.designpatterns.builder;



/**
 * @author Rami Ammous
 */
public class BankDirector {

    public static BankAccount.AccountBuilder accountBuilder(){

        return new BankAccount.AccountBuilder();
    }

}
