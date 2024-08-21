package com.ammous.designpatterns.creational.scopeobject.singleton;

import com.ammous.designpatterns.creational.scopeobject.singleton.model.BankAccount;
import com.ammous.designpatterns.creational.scopeobject.singleton.model.AccountStatus;
import com.ammous.designpatterns.creational.scopeobject.singleton.model.AccountType;
import com.ammous.designpatterns.creational.scopeobject.singleton.model.BankDirector;
import com.ammous.designpatterns.creational.scopeobject.singleton.util.JsonSeriliazer;

/**
 * @author Rami Ammous
 */
public class TestRami {
    public static void main(String[] args) {
        BankAccount bankAccount = BankDirector.accountBuilder()
                .accountId(1L)
                .balance(102565125)
                .type(AccountType.CURRENT_ACOUNT)
                .status(AccountStatus.ACTIVATED)
                .build();

        JsonSeriliazer<BankAccount> seriliazer= new JsonSeriliazer<>();
        System.out.println(seriliazer.toJson(bankAccount));

    }
}
