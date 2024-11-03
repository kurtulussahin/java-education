package com.kurtulussahin.java.codekata.neetcodeoopexamples.bank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankTest {

    @Test
    void createBankAccount(){
        BankAccount account = new BankAccount (1, "John Doe", 999);
    }

    @Test
    void getBalance(){
        BankAccount account = new BankAccount (1, "John Doe", 999);
        assertEquals(999,account.getBalance() );

    }

    @Test
    void deposit(){
        BankAccount account = new BankAccount (1, "John Doe", 0);
        account.deposit(100);
        account.deposit(100);
        account.deposit(100);
        assertEquals(300,account.getBalance() );
    }

    @Test
    void withdraw(){
        BankAccount account = new BankAccount (1, "John Doe", 999);
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

    @Test
    void createWithdrawTransaction(){
        int customerId=1;
        int amount = 999;

        Transaction transaction = new Withdraw(customerId, amount );

    }

    @Test
    void openAccountTransaction(){
        int customerId=1;

        Transaction transaction = new OpenAccount(customerId );

    }

    @Test
    void createBankSystem(){
        BankSystem bankSystem = new BankSystem(new ArrayList<BankAccount>(), new ArrayList<Transaction>());

    }

    @Test
    void bankSystemOpenAccount(){
        BankSystem bankSystem = new BankSystem(new ArrayList<BankAccount>(), new ArrayList<Transaction>());

        int customerId = bankSystem.openAccount("John Doe");
    }


    @Test
    void bankSystemDeposit(){
        BankSystem bankSystem = new BankSystem(new ArrayList<BankAccount>(), new ArrayList<Transaction>());

        int customerId = bankSystem.openAccount("John Doe");
        bankSystem.deposit(customerId, 999);
    }

    @Test
    void bankSystemWithdraw(){
        BankSystem bankSystem = new BankSystem(new ArrayList<BankAccount>(), new ArrayList<Transaction>());

        int customerId = bankSystem.openAccount("John Doe");
        bankSystem.deposit(customerId, 999);

        bankSystem.withdraw(customerId, 100);
    }

    @Test
    public void bankSystemWithdrawInsufficient(){
        BankSystem bankSystem = new BankSystem(new ArrayList<BankAccount>(), new ArrayList<Transaction>());

        int customerId = bankSystem.openAccount("John Doe");
        bankSystem.deposit(customerId, 999);

        assertThrows(Error.class, () -> {
            bankSystem.withdraw(customerId, 1000);
        });

    }




}
