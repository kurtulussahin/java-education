package com.kurtulussahin.codekata.bankapps.techliterate.atm;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.security.MessageDigest;

public class User {

    private String firstName;
    private String lastName;
    private String uuid;
    private byte pinHash[];
    private ArrayList<Account> accounts;

    public User(String firstName, String lastName, String pin, Bank theBank) {
        this.uuid=theBank.getNewUserUUID();
        this.firstName = firstName;
        this.lastName =lastName;

        MessageDigest md= null;
        try {
            md = MessageDigest.getInstance("MD5");
            this.pinHash=md.digest(pin.getBytes());
        } catch (NoSuchAlgorithmException e) {
            System.err.println("error, caught NoSuchAlgorithmException");
            throw new RuntimeException(e);
        }

        this.accounts=new ArrayList<Account>();
        System.out.printf("New user %s, %s with Id %s created.\n", this.lastName, firstName, this.uuid);
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public String getUUID() {
        return uuid;
    }

    public boolean validatePin(String pin) {

        MessageDigest md= null;
        try {
            md = MessageDigest.getInstance("MD5");
            byte[] newPinHash=md.digest(pin.getBytes());
            if(pinHash.equals(newPinHash)){
                return true;
            }
        } catch (NoSuchAlgorithmException e) {
            System.err.println("error, caught NoSuchAlgorithmException");
            throw new RuntimeException(e);
        }
        return true;
    }

    public String getFirstname() {
        return firstName;
    }

    //TODO
    public void printAccountsSummary() {
        System.out.printf("\n\n%s' accounts summary", firstName);
        for(int a=0; a<accounts.size(); a++){
            System.out.printf("%d) %s\n", a+1, accounts.get(a).getSummary() );
        }
        System.out.println();
    }

    public int numAccounts() {
        return accounts.size();
    }

    public void printAccountTransactionsHistory(int accIdx) {
        this.accounts.get(accIdx).printTransHistory();
    }

    public double getAcctBalance(int accountID) {

        return accounts.get(accountID).getBalance();
    }

    public void addAcctTransaction(int accountID, double amount, String memo) {
        accounts.get(accountID).addTransaction(amount, memo);

    }

    public Object getAcctUUID(int accountID) {
        return accounts.get(accountID).getUUID();
    }
}
