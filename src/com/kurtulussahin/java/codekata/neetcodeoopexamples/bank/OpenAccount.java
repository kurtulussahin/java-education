package com.kurtulussahin.java.codekata.neetcodeoopexamples.bank;

public class OpenAccount extends Transaction {
    public OpenAccount(int customerId) {
        super(customerId);
    }

    @Override
    public String getDiscription() {
        return " opened account " + getCustomerId();
    }
}
