package com.kurtulussahin.java.codekata.neetcodeoopexamples.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {

    @Test
    void createBankAccount(){
        BankAccount account = new BankAccount (1, "Kurtuluş Şahin", 999);
    }

    @Test
    void getBalance(){
        BankAccount account = new BankAccount (1, "Kurtuluş Şahin", 999);
        assertEquals(999,account.getBalance() );
    }

    @Test
    void deposit(){
        BankAccount account = new BankAccount (1, "Kurtuluş Şahin", 0);
        account.deposit(100);
        account.deposit(100);
        account.deposit(100);
        assertEquals(300,account.getBalance() );
    }

    @Test
    void withdraw(){
        BankAccount account = new BankAccount (1, "Kurtuluş Şahin", 999);
        account.withdraw(100);
        account.withdraw(100);
        account.withdraw(100);
        assertEquals(699,account.getBalance() );
    }

    @Test
    void createDepositTransaction(){
        int customerId=1;
        int amount = 999;

        Transaction transaction = new Deposit(customerId, amount );

    }



}
