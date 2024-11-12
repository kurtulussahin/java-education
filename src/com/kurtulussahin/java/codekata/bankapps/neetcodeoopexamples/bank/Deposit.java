package com.kurtulussahin.java.codekata.bankapps.neetcodeoopexamples.bank;

public class Deposit extends Transaction {
    private int amount;
    public Deposit(int customerId, int amount) {

        super(customerId);
        this.amount=amount;
    }

    @Override
    public String getDiscription() {
        return " deposited " + amount + " to account " + getCustomerId();
    }
}
