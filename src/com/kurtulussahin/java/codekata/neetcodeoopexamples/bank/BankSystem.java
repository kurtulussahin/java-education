package com.kurtulussahin.java.codekata.neetcodeoopexamples.bank;

import java.util.ArrayList;

public class BankSystem {
    private ArrayList<BankAccount> bankAccounts;
    private ArrayList<Transaction> transactions;

    public BankSystem(ArrayList<BankAccount> bankAccounts, ArrayList<Transaction> transactions) {
        this.bankAccounts = bankAccounts;
        this.transactions = transactions;
    }

    public int openAccount(String CustomerName) {
        int customerId= bankAccounts.size();
        BankAccount account = new BankAccount (customerId, CustomerName, 0);
        bankAccounts.add(account);

        Transaction transaction = new OpenAccount(customerId );
        transactions.add(transaction);

        return customerId;
    }

    public void deposit(int customerId, int amount) {
        BankAccount account = bankAccounts.get(customerId);
        account.deposit(amount);
    }

    public void withdraw(int customerId, int amount) {
        if(amount>bankAccounts.get(customerId).getBalance()){
            throw new Error("Insufficient funds");
        }
        BankAccount account = bankAccounts.get(customerId);
        account.withdraw(amount);
    }

    public BankAccount getAccount(int customerId) {
        return bankAccounts.get(customerId);
    }
}
