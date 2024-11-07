package com.kurtulussahin.java.codekata.techliterate.atm;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank("JavaBank");

        User user = bank.addUser("John", "Doe", "1234");

        Account account = new Account("Checking", user,bank);
        user.addAccount(account);
        bank.addAccount(account);

    }
}
