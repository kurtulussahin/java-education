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

        User curUser;

        while(true){
            curUser=ATM.mainMenuPrompt(bank, sc);
            ATM.printUserMenu(curUser, sc);
        }

    }

    //TODO
    private static void printUserMenu(User curUser, Scanner sc) {

    }

    private static User mainMenuPrompt(Bank bank, Scanner sc) {
        String userID;
        String pin;
        User authUser;

        do{
            System.out.printf("\n\nWelcome to %s\n\n", bank.getName());
            System.out.printf("Enter user ID: ");
            userID = sc.nextLine();
            System.out.printf("Enter pin: ");
            pin = sc.nextLine();

            authUser=bank.userLogin(userID,pin);
            if(authUser==null){
                System.out.println("Incorrect User ID/Pin. Please try again");

            }

        }while(authUser==null);
        return authUser;
    }
}
