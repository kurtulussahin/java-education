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



}
