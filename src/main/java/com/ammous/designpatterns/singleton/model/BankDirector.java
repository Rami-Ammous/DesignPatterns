package com.ammous.designpatterns.singleton.model;


/**
 * @author Rami Ammous
 */
public class BankDirector {

    public static BankAccount.AccountBuilder accountBuilder(){

        return new BankAccount.AccountBuilder();
    }

}
