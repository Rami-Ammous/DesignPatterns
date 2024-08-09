package com.ammous.designpatterns.singleton;

import com.ammous.designpatterns.singleton.model.AccountStatus;
import com.ammous.designpatterns.singleton.model.BankAccount;
import com.ammous.designpatterns.singleton.repository.AccountRepositoryImpl;
import com.ammous.designpatterns.singleton.util.JsonSeriliazer;

import java.io.IOException;
import java.util.function.Predicate;

/**
 * @author Rami Ammous
 */
public class MainMultiThread {

    public static void main(String[] args) throws IOException {


        AccountRepositoryImpl accountRepository = AccountRepositoryImpl.getInstance();

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                accountRepository.populateData();
            }).start();
        }
        System.out.println("tape a character");
        System.in.read();
        accountRepository.populateData();


        JsonSeriliazer<BankAccount> bankAccountJsonSeriliazer = new JsonSeriliazer<>();

        System.out.println("===================");
        Predicate<BankAccount> isActivated = account -> account.getStatus() == AccountStatus.ACTIVATED;

        accountRepository.findAll().stream()
                .map(bankAccountJsonSeriliazer::toJson)
                .forEach(System.out::println);


    }
}
