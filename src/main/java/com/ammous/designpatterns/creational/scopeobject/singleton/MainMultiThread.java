package com.ammous.designpatterns.creational.scopeobject.singleton;

import com.ammous.designpatterns.creational.scopeobject.singleton.model.AccountStatus;
import com.ammous.designpatterns.creational.scopeobject.singleton.model.BankAccount;
import com.ammous.designpatterns.creational.scopeobject.singleton.repository.AccountRepositoryImpl;
import com.ammous.designpatterns.creational.scopeobject.singleton.util.JsonSeriliazer;

import java.io.IOException;
import java.util.function.Predicate;

/**
 * @author Rami Ammous
 */
public class MainMultiThread {

    public static void main(String[] args) throws IOException {


        AccountRepositoryImpl accountRepository = AccountRepositoryImpl.getInstance();

        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                accountRepository.populateData();
            }).start();
        }
        System.out.println("tape a character");
        System.in.read();


        JsonSeriliazer<BankAccount> bankAccountJsonSeriliazer = new JsonSeriliazer<>();

        System.out.println("===================");
        Predicate<BankAccount> isActivated = account -> account.getStatus() == AccountStatus.ACTIVATED;

        accountRepository.findAll().stream()
                .map(bankAccountJsonSeriliazer::toJson)
                .forEach(System.out::println);


    }
}
