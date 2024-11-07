package com.kurtulussahin.java.codekata.techliterate.atm;

import org.apache.commons.lang3.ObjectUtils;

import java.util.ArrayList;
import java.util.Random;

public class Bank {

    private String name;
    private ArrayList<User> users;
    private ArrayList<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.users=new ArrayList<User>();
        this.accounts=new ArrayList<Account>();
    }

    public String getNewUserUUID() {
        String uuid;
        Random rng=new Random();
        int len = 6;
        boolean nonUnique = false;

        do{
            uuid="";
            for(int c =0; c<len; c++){
                uuid +=((Integer) rng.nextInt(10)).toString();
            }

            for(User u : users){
                if(uuid.compareTo(u.getUUID())==0){
                    nonUnique=true;
                    break;
                }
            }
        }while(nonUnique);

        return uuid;
    }

    public String getNewAccountUUID() {

        String uuid;
        Random rng=new Random();
        int len = 10;
        boolean nonUnique = false;

        do{
            uuid="";
            for(int c =0; c<len; c++){
                uuid +=((Integer) rng.nextInt(10)).toString();
            }

            for(Account a : accounts){
                if(uuid.compareTo(a.getUUID())==0){
                    nonUnique=true;
                    break;
                }
            }
        }while(nonUnique);

        return uuid;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public User addUser(String firstName, String lastName, String pin){
        User user = new User(firstName,lastName,pin, this);
        this.users.add(user);

        Account account = new Account("Savings", user,this);

        user.addAccount(account);
        this.addAccount(account);

        return user;
    }

    public User userLogin(String userID, String pin){
        for(User u : users){
            if(u.getUUID().compareTo(userID)==0 && u.validatePin(pin)){
                return u;
            }
        }
        return null;
    }
}
