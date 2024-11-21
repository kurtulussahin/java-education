package com.kurtulussahin.codekata.bankapps.vandersmissen.javabank;

public class Account {
    private double balance;
    private double interest;
    private int accountNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    private static int numberOfAccounts=1000000;

    public Account(){
        accountNumber=numberOfAccounts++;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println(("You have insufficient funds."));
            return;
        }
        balance -=amount;
        System.out.println(("You have withdrawn $"+amount + "dolars"));
        System.out.println(("You have a balance of $"+balance));
    }

    public void deposit(double amount){
        if(amount<0){
            System.out.println(("You cannot deposit negative amount"));
            return;
        }
        balance +=amount;
        System.out.println(("You have deposited $"+amount + "dolars"));
        System.out.println(("You have a balance of $"+balance));

    }

}
