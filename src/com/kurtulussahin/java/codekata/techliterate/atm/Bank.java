package com.kurtulussahin.java.codekata.techliterate.atm;

import java.util.ArrayList;
import java.util.Random;

public class Bank {

    private String name;
    private ArrayList<User> users;
    private ArrayList<Account> accounts;

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

        Account newAccount = new Account("Savings", user,this);

        return user;
    }
}
