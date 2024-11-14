
package com.kurtulussahin.java.temeller.multithreding.synchronization;

public class ATMTest {
    
    static final BankAccount account = new BankAccount();
    
    public static void main(String[] args) {
        
        account.topUp(100);
        
        Thread t1 = new Thread(() -> {                            
            ATM.withdraw(account, 100);
            
        });        
        
        Thread t2 = new Thread(() -> {
            ATM.withdraw(account, 100);
        });

        Thread t3 = new Thread(() -> {
            ATM.withdraw(account, 100);
        });

        Thread t4 = new Thread(() -> {
            ATM.withdraw(account, 100);
        });

        Thread t5 = new Thread(() -> {
            ATM.withdraw(account, 100);
        });
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }

        
    
}
