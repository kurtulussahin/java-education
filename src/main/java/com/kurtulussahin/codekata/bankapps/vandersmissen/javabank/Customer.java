package com.kurtulussahin.codekata.bankapps.vandersmissen.javabank;

public class Customer {

    private final String firstName;
    private final String lastName;
    private final String ssn;
    private final Account account;

    public Customer(String firstName, String lastName, String ssn, Account account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.account = account;
    }

    @Override
    public String toString(){
            return "\nCustomer Information: " +
                    "First Name: " + firstName+
                    "Last Name: " + lastName +
                    "SSN: " + ssn +
                    "Account: " + account.toString();

    }
}
