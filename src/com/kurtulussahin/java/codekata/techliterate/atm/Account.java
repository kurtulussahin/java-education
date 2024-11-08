package com.kurtulussahin.java.codekata.techliterate.atm;

import java.util.ArrayList;

public class Account {

    private String name;
    private String uuid;
    private User holder;
    private ArrayList<Transaction> transactions;

    public Account(String name, User holder, Bank theBank) {
        this.name = name;
        this.holder = holder;

        this.uuid=theBank.getNewAccountUUID();
        this.transactions = new ArrayList<Transaction>();

    }

    public String getUUID() {
        return uuid;
    }

    public String getSummary() {
        double balance = this.getBalance();

        if(balance>=0){
            return String.format("%s : $%.02f : %s", uuid, balance, name);
        }else {
            return String.format("%s : $(%.02f) : %s", uuid, balance, name);

        }

    }

    //TODO
    private double getBalance() {
        double balance=0;
                for(Transaction t : transactions ){
                    balance+=t.getAmount();
                }
        return balance;

    }
}
