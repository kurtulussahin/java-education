package com.kurtulussahin.codekata.bankapps.neetcodeoopexamples.bank;

public abstract class Transaction {
    private int customerId;

    public Transaction(int customerId) {
        this.customerId = this.customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public abstract String getDiscription();
}
