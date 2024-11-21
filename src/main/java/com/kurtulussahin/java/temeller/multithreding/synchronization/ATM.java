
package com.kurtulussahin.java.temeller.multithreding.synchronization;

public class ATM {    
    
    static synchronized void withdraw(BankAccount account, int amount) {
        int balance = account.getBalance();
        if((account.getBalance() - amount) < 0) {
            System.out.println("Transaction denied!");
        } else {
            for(int i=0; i<100000; i++){
                //waiting to create a race condition
            }
            account.debit(amount);
            System.out.println("$" + amount + " successfully withdrawn");
        }
        System.out.println("Current balance: " + account.getBalance());                           
        
    }
    
    
}
