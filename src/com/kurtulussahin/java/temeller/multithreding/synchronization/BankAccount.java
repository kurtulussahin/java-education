
package com.kurtulussahin.java.temeller.multithreding.synchronization;

public class BankAccount {
    
    private int balance = 0;

    public BankAccount() {
    }

    void topUp(int amount) {
        balance += amount;
        System.out.println("Balance: " + balance);
    }
    
    void debit(int amount) {
        balance -= amount;
    }
    
    int getBalance() {
       return balance; 
    }


}
