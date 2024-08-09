package com.ammous.designpatterns.singleton;

import com.ammous.designpatterns.singleton.model.AccountStatus;
import com.ammous.designpatterns.singleton.model.BankAccount;
import com.ammous.designpatterns.singleton.repository.AccountRepositoryImpl;
import com.ammous.designpatterns.singleton.util.JsonSeriliazer;

import java.util.function.Predicate;

/**
 * @author Rami Ammous
 */
public class Main {

    public static void main(String[] args) {


        AccountRepositoryImpl accountRepository = AccountRepositoryImpl.getInstance();
        AccountRepositoryImpl accountRepository2 = AccountRepositoryImpl.getInstance();
        AccountRepositoryImpl accountRepository3 = AccountRepositoryImpl.getInstance();

        accountRepository.populateData();
        /*accountRepository.findAll().stream().forEach(
                System.out::println
        );*/

        JsonSeriliazer<BankAccount> bankAccountJsonSeriliazer=new JsonSeriliazer<>();
        accountRepository.findAll().stream()
                .map(bankAccountJsonSeriliazer::toJson)
                .forEach(System.out::println);


        System.out.println("===================");
        BankAccount bankAccount = accountRepository.findById(10L).orElse(null);
        System.out.println(bankAccountJsonSeriliazer.toJson(bankAccount));

        System.out.println("===================");
        Predicate<BankAccount> isActivated = account -> account.getStatus()==AccountStatus.ACTIVATED;

        accountRepository.searchAccount(isActivated).stream()
                .map(bankAccountJsonSeriliazer::toJson)
                .forEach(System.out::println);


    }
}
