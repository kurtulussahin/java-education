package com.kurtulussahin.java.ibtechproject;

import java.util.Date;
import java.util.List;

public class DemoCRUD {
	public static void main(String[] args) {
		CustomerFactory customerFactory =new CustomerFactory();
		IModel newCustomer = customerFactory.createCustomer();
		
		IDAO customerDAO = new CustomerDAO(newCustomer);
		customerDAO.save();
	}
}