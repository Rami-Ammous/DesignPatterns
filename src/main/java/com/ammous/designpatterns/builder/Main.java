package com.ammous.designpatterns.builder;



/**
 * @author Rami Ammous
 */
public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = BankDirector.accountBuilder()
                .accountId(1L)
                .balance(100)
                .currency("currency")
                .status(AccountStatus.ACTIVATED)
                .type(AccountType.SAVING_ACCOUNT)
                .build();

        System.out.println(bankAccount);
    }
}
