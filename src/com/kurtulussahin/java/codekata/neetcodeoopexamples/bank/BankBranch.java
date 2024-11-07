package com.kurtulussahin.java.codekata.neetcodeoopexamples.bank;

public class BankBranch {
    private String address;
    private int cashOnHand;
    private BankSystem bankSystem;

    public BankBranch(String address, int cashOnHand, BankSystem bankSystem) {
        this.address = address;
        this.cashOnHand = cashOnHand;
        this.bankSystem = bankSystem;
    }

    public int openAccount(String customerName) {
        return bankSystem.openAccount(customerName);
    }

    public void deposit(int customerId, int amount) {
        bankSystem.deposit(customerId,amount);
        this.cashOnHand += amount;
    }

    public void withdraw(int customerId, int amount) {
        if (amount > this.cashOnHand) {
            throw new Error("Branch does not have enough cash");
        }
        this.cashOnHand -= amount;
        bankSystem.withdraw(customerId,amount);
    }
}
