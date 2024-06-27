package com.kurtulussahin.java.ibtechproject;

import java.util.Date;

public class CustomerFactory {
public Customer createCustomer() {
	Customer newCustomer = new Customer();
    newCustomer.setFirstName("John");
    newCustomer.setLastName("Doe");
    newCustomer.setDateOfBirth(new Date());
    newCustomer.setEmail("john.doe@example.com");
    newCustomer.setNationality("USA");
    newCustomer.setCreatedDate(new Date());
    newCustomer.setStatus("Aktif");
	return newCustomer;
	
}
}
