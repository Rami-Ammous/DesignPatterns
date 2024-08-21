package com.ammous.designpatterns.creational.scopeobject.singleton.repository;


import com.ammous.designpatterns.creational.scopeobject.singleton.model.BankAccount;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * @author Rami Ammous
 */
public interface AccountRepository {

    BankAccount save(BankAccount bankAccount);

    List<BankAccount> findAll();

    Optional<BankAccount> findById(Long id);

    List<BankAccount> searchAccount(Predicate<BankAccount> predicate);

    BankAccount update(BankAccount account);

    void deleteById(Long id);

}
