package com.ammous.designpatterns.creational.scopeobject.prototype;


/**
 * @author Rami Ammous
 */
public class BankAccount implements  Cloneable{

    @Override
    public BankAccount clone() throws CloneNotSupportedException {
        BankAccount bankAccount = (BankAccount) super.clone();
        //bankAccount.setCustomer(((BankAccount) super.clone()).getCustomer().clone());
        bankAccount.setCustomer(this.getCustomer().clone());
        return bankAccount;
    }

    private Long accountId;
    private double balance;
    private String currency;
    private String type;
    private String status;
    private Customer customer;

    public Long getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BankAccount(Long accountId, double balance, String currency, String type, String status, Customer customer) {
        this.accountId = accountId;
        this.balance = balance;
        this.currency = currency;
        this.type = type;
        this.status = status;
        this.customer = customer;
    }

    public BankAccount() {
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId=" + accountId +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", customer=" + customer +
                '}';
    }

    public static AccountBuilder builder(){
        return new AccountBuilder();
    }

    public static class AccountBuilder {

        private BankAccount bankAccount = new BankAccount();

        public AccountBuilder accountId(Long id) {
            bankAccount.accountId = id;
            return this;
        }

        public AccountBuilder balance(double balance) {
            bankAccount.balance = balance;
            return this;
        }

        public AccountBuilder currency(String currency) {
            bankAccount.currency = currency;
            return this;
        }

        public AccountBuilder type(String type) {
            bankAccount.type = type;
            return this;
        }

        public AccountBuilder status(String status) {
            bankAccount.status = status;
            return this;
        }

        public BankAccount build() {
            return this.bankAccount;
        }
    }
}
