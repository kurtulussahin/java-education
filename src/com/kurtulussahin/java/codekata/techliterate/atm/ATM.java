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

    private static void printUserMenu(User user, Scanner sc) {

        user.printAccountsSummary();

        int choice;

        do{
            System.out.printf("Welcome %s, what would you like to do?", user.getFirstname());
            System.out.println(" 1) Show account transactin history");
            System.out.println(" 1) Withdraw");
            System.out.println(" 1) Deposit");
            System.out.println(" 1) Transfer");
            System.out.println(" 1) Quit");
            System.out.println();
            System.out.println("Enter choice: ");
            choice = sc.nextInt();

            if(choice<1 || choice>5){
                System.out.println("Invalid choice. please choose 1-5");
            }
        }while(choice<1 || choice>5);

        switch(choice){
            case 1:
                ATM.showTransactionHistory(user,sc);
                break;
            case 2:
                ATM.withdraw(user,sc);
                break;
            case 3:
                ATM.deposit(user,sc);
                break;
            case 4:
                ATM.transferFunds(user,sc);
                break;
        }

        if(choice!=5){
            ATM.printUserMenu(user,sc);
        }

    }

    //TODO
    private static void transferFunds(User user, Scanner sc) {
    }

    //TODO
    private static void deposit(User user, Scanner sc) {
    }

    //TODO
    private static void withdraw(User user, Scanner sc) {
    }

    //TODO
    private static void showTransactionHistory(User user, Scanner sc) {
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
