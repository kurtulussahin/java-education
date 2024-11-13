package com.kurtulussahin.java.codekata.bankapps.vandersmissen.javabank;

import java.util.ArrayList;

public class Bank {
    ArrayList<Customer> customers new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
}
