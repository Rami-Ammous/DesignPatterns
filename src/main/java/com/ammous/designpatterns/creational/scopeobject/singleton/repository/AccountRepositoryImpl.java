package com.ammous.designpatterns.creational.scopeobject.singleton.repository;

import com.ammous.designpatterns.singleton.model.AccountStatus;
import com.ammous.designpatterns.singleton.model.AccountType;
import com.ammous.designpatterns.singleton.model.BankAccount;
import com.ammous.designpatterns.singleton.model.BankDirector;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Rami Ammous
 */
public class AccountRepositoryImpl implements AccountRepository {

    // Le constructeur privé empêche l'instanciation en dehors de la classe
    private AccountRepositoryImpl() {}


    /*

    */
    /**********************************************************
    1ere methode
    ************************************************************//*

    private static final AccountRepositoryImpl accountRepository;

    static {
        System.out.println("Singleton instantiation");
        accountRepository = new AccountRepositoryImpl();
    }
    public static AccountRepositoryImpl getInstance() {
        return accountRepository;
    }

*/

    /**********************************************************
     2eme methode
     ************************************************************/
    private static  AccountRepositoryImpl accountRepository;

    public synchronized static AccountRepositoryImpl getInstance() {
       if (accountRepository == null)
               {
                   System.out.println("Singleton instantiation");
                   accountRepository = new AccountRepositoryImpl();
               }
         return accountRepository;
    }


    private Map<Long, BankAccount> bankAccountMap = new HashMap<>();
    private long  accountsCount = 0;


    // synchronizer la variable/l'objet
    @Override
    public BankAccount save(BankAccount bankAccount) {

        long accountId;
        synchronized (this){
            accountId = ++accountsCount;
        }
        bankAccount.setAccountId(accountId);

        synchronized (this){
            bankAccountMap.put(accountId, bankAccount);
        }
        return bankAccount;
    }

    //synchronizer la méthode
   /* @Override
    public synchronized BankAccount save(BankAccount bankAccount) {

        long    accountId = ++accountsCount;
        bankAccount.setAccountId(accountId);
        bankAccountMap.put(accountId, bankAccount);
        return bankAccount;
    }*/

    @Override
    public List<BankAccount> findAll() {

        return bankAccountMap.values().stream().collect(Collectors.toList());
    }

    @Override
    public Optional<BankAccount> findById(Long id) {
        BankAccount account = bankAccountMap.get(id);
        if (account == null) return Optional.empty();
        return Optional.of(account);
    }

    @Override
    public List<BankAccount> searchAccount(Predicate<BankAccount> predicate) {

        return bankAccountMap.values().stream().filter(predicate).collect(Collectors.toList());
    }

    @Override
    public BankAccount update(BankAccount account) {

        bankAccountMap.put(account.getAccountId(), account);
        return account;
    }

    @Override
    public void deleteById(Long id) {
        bankAccountMap.remove(id);
    }


    public void populateData() {
        for (int i = 0; i < 10; i++) {
            BankAccount bankAccount = BankDirector.accountBuilder()
                    .balance(10000 + Math.random() * 90000)
                    .type(Math.random() > 0.5 ? AccountType.SAVING_ACCOUNT : AccountType.CURRENT_ACOUNT)
                    .status(Math.random() > 0.5 ? AccountStatus.CREATED : AccountStatus.ACTIVATED)
                    .currency(Math.random() > 0.5 ? "MAD" : "USD")
                    .build();
            save(bankAccount);
            System.out.println("******************************************************");
            System.out.println(Thread.currentThread().getName());
            System.out.println("Account count = "+accountsCount);
            System.out.println("Size : " + bankAccountMap.values().size());
            System.out.println("******************************************************");


        }
    }


}
