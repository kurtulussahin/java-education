package com.kurtulussahin.java.codekata.bankapps.neetcodeoopexamples.bank;

public class BankAccount {
    private int customerId;
    private String name;
    private int balance;

    public BankAccount(int customerId, String name, int balance) {
        this.customerId = customerId;
        this.name = name;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance=balance+amount;
    }

    public void withdraw(int amount) {
        balance=balance-amount;
    }
}
