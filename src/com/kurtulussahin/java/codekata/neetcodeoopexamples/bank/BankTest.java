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
    void bankSystemWithdrawInsufficient(){
        BankSystem bankSystem = new BankSystem(new ArrayList<BankAccount>(), new ArrayList<Transaction>());

        int customerId = bankSystem.openAccount("John Doe");
        bankSystem.deposit(customerId, 999);

        assertThrows(Error.class, () -> {
            bankSystem.withdraw(customerId, 1000);
        });

    }


    @Test
    void bankSystemGetAccount(){
        BankSystem bankSystem = new BankSystem(new ArrayList<BankAccount>(), new ArrayList<Transaction>());

        int customerId = bankSystem.openAccount("John Doe");
        BankAccount account= bankSystem.getAccount(customerId);

    }

    @Test
    void bankSystemGetTransactions(){
        BankSystem bankSystem = new BankSystem(new ArrayList<BankAccount>(), new ArrayList<Transaction>());

        int customerId1 = bankSystem.openAccount("John Doe");
        int customerId2 = bankSystem.openAccount("John Doe 2");
        int customerId3 = bankSystem.openAccount("John Doe 3");

        bankSystem.deposit(customerId1, 999);
        bankSystem.deposit(customerId2, 999);
        bankSystem.deposit(customerId3, 999);

        bankSystem.withdraw(customerId1, 100);
        bankSystem.withdraw(customerId2, 100);
        bankSystem.withdraw(customerId3, 100);

        assertEquals(9,bankSystem.getTransactions().size());

    }

    @Test
    void bankSystemGetAccounts(){
        BankSystem bankSystem = new BankSystem(new ArrayList<BankAccount>(), new ArrayList<Transaction>());

        bankSystem.openAccount("John Doe");
        bankSystem.openAccount("John Doe 2");
        bankSystem.openAccount("John Doe 3");

        assertEquals(3,bankSystem.getAccounts().size());
    }

    @Test
    void createBankBranch(){
        BankSystem bankSystem = new BankSystem(new ArrayList<BankAccount>(), new ArrayList<Transaction>());

        BankBranch branch1 = new BankBranch("Adress 1", 1000000, bankSystem);

    }

}
