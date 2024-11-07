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
}
