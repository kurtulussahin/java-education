package com.kurtulussahin.java.codekata.neetcodeoopexamples.bank;

public class Withdraw extends Transaction {
    private int amount;
    public Withdraw(int customerId, int amount) {

        super(customerId);
        this.amount=amount;
    }

    @Override
    public String getDiscription() {
        return "";
    }
}
