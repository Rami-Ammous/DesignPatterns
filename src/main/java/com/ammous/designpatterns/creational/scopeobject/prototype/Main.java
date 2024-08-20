package com.ammous.designpatterns.creational.scopeobject.prototype;

/**
 * @author Rami Ammous
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Main.main");
        BankAccount account1 = new BankAccount();
        account1.setAccountId(1L);
        account1.setBalance(100);
        account1.setCurrency("currency");
        account1.setBalance(100000);
        account1.setType("type");
        account1.setStatus("status");

        Customer customer1 = new Customer(1l,"Rami Ammous");
        account1.setCustomer(customer1);

        //le meme Objet
        BankAccount account2 = account1;

        //clone : une nouvelle instance similaire a account1
        BankAccount account3 = account1.clone();

        System.out.println("account1 = " + account1);
        System.out.println("account2 = " + account2);
        System.out.println("account3 = " + account3);



        account1.setAccountId(123L);
        account1.getCustomer().setName("Mohamed");

        System.out.println("================================");

        System.out.println("account1 = " + account1);
        System.out.println("account2 = " + account2);
        System.out.println("account3 = " + account3);



    }

}
