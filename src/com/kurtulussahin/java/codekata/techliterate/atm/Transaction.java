package com.kurtulussahin.java.codekata.techliterate.atm;

import java.util.Date;

public class Transaction {

    private double amount;
    private Date timestamp;
    private String memo;
    private Account inAccount;

    public Transaction(double amount, Account inAccount) {
        this.amount = amount;
        this.inAccount = inAccount;
        this.timestamp=new Date();
        this.memo="Account Created";
    }

    public Transaction(double amount, Account inAccount, String memo) {
        this(amount,inAccount);
        this.memo = memo;
    }

    public double getAmount() {
        return amount;
    }
}
