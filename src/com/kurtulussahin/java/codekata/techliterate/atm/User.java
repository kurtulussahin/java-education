package com.kurtulussahin.java.codekata.techliterate.atm;

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
}
