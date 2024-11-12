package com.kurtulussahin.java.codekata.bankapps.techliterate.atm;

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
            System.out.printf("Welcome %s, what would you like to do?\n", user.getFirstname());
            System.out.println(" 1) Show account transactin history");
            System.out.println(" 2) Withdraw");
            System.out.println(" 3) Deposit");
            System.out.println(" 4) Transfer");
            System.out.println(" 5) Quit");
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

    private static void transferFunds(User user, Scanner sc) {

        int fromAcct;
        int toAcct;
        double amount;
        double acctBal;

        do{
            System.out.printf("Enter the number (1-%d) of the account\n" +
                    "to transfer from: ");
            fromAcct=sc.nextInt()-1;

            if(fromAcct<0 || fromAcct >= user.numAccounts()){
                System.out.println("ınvalid account. Please try again.");
            }
        }while(fromAcct<0 || fromAcct>=user.numAccounts());

        acctBal=user.getAcctBalance(fromAcct);


        do{
            System.out.printf("Enter the number (1-%d) of the account\n" +
                    "to transfer from: ");
            toAcct=sc.nextInt()-1;

            if(toAcct<0 || toAcct >= user.numAccounts()){
                System.out.println("ınvalid account. Please try again.");
            }
        }while(toAcct<0 || toAcct>=user.numAccounts());

        do{
            System.out.printf("Enter the amount to transfer(max $%.02f): $", acctBal);
            amount=sc.nextDouble();

            if(amount<0){
                System.out.println("Amount must be greater than zero.");
            }else if(amount>acctBal){
                System.out.printf("Amount must not be greater than \n"
                        + "balance of  $%.02f.\n", acctBal);
            }
        }while(amount<0 || amount>acctBal);

        user.addAcctTransaction(fromAcct, -1*amount,
                String.format("Transfer to account %s", user.getAcctUUID(toAcct)));
        user.addAcctTransaction(toAcct, amount,
                String.format("Transfer to account %s", user.getAcctUUID(fromAcct)));
    }


    private static void deposit(User user, Scanner sc) {

        int toAcct;
        double amount;
        double acctBal;
        String memo;

        do{
            System.out.printf("Enter the number (1-%d) of the account\n" +
                    "to transfer from: ",user.numAccounts());
            toAcct=sc.nextInt()-1;

            if(toAcct<0 || toAcct >= user.numAccounts()){
                System.out.println("ınvalid account. Please try again.");
            }
        }while(toAcct<0 || toAcct>=user.numAccounts());

        acctBal=user.getAcctBalance(toAcct);

        do{
            System.out.printf("Enter the amount to transfer(max $%.02f): $", acctBal);
            amount=sc.nextDouble();

            if(amount<0){
                System.out.println("Amount must be greater than zero.");
            }else if(amount>1000000){
                System.out.printf("Amount must not be greater than \n"
                        + "balance of  $%.02f.\n", 1000000);
            }
        }while(amount<0 || amount>1000000);

        sc.nextLine();

        System.out.println("Enter a memo: ");
        memo=sc.nextLine();

        user.addAcctTransaction(toAcct, amount, memo);
    }

    private static void withdraw(User user, Scanner sc) {

        int fromAcct;
        double amount;
        double acctBal;
        String memo;

        do{
            System.out.printf("Enter the number (1-%d) of the account\n" +
                    "to transfer from: ");
            fromAcct=sc.nextInt()-1;

            if(fromAcct<0 || fromAcct >= user.numAccounts()){
                System.out.println("ınvalid account. Please try again.");
            }
        }while(fromAcct<0 || fromAcct>=user.numAccounts());

        acctBal=user.getAcctBalance(fromAcct);

        do{
            System.out.printf("Enter the amount to transfer(max $%.02f): $", acctBal);
            amount=sc.nextDouble();

            if(amount<0){
                System.out.println("Amount must be greater than zero.");
            }else if(amount>acctBal){
                System.out.printf("Amount must not be greater than \n"
                        + "balance of  $%.02f.\n", acctBal);
            }
        }while(amount<0 || amount>acctBal);

        sc.nextLine();

        System.out.println("Enter a memo: ");
        memo=sc.nextLine();

        user.addAcctTransaction(fromAcct, -1*amount, memo);

    }

    private static void showTransactionHistory(User user, Scanner sc) {

        int theAccount;
        do{
            System.out.printf("Enter the number (1-%d) of of the aacount\n" +
                    " whose transactions you want to see: ",
                    user.numAccounts());

            theAccount=sc.nextInt()-1;

            if(theAccount<0 || theAccount >=user.numAccounts()){
                System.out.println("ınvalid account. Please try again.");
            }
        }while(theAccount<0 || theAccount>=user.numAccounts());

        user.printAccountTransactionsHistory(theAccount);
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
