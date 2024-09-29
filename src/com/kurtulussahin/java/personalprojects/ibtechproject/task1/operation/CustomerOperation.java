package com.kurtulussahin.java.personalprojects.ibtechproject.task1.operation;

import java.util.List;

import com.kurtulussahin.java.personalprojects.ibtechproject.task1.bag.Bag;
import com.kurtulussahin.java.personalprojects.ibtechproject.task1.bag.BagKey;
import com.kurtulussahin.java.personalprojects.ibtechproject.task1.dao.CustomerDao;
import com.kurtulussahin.java.personalprojects.ibtechproject.task1.model.Customer;

public class CustomerOperation implements CrudOperations {

	private CustomerDao customerDao;

	public CustomerOperation() {
		this.customerDao = new CustomerDao();
	}

	@Override
	public Bag add(Bag bag) {
		String name = (String) bag.getValue(BagKey.NAME);
		String surname = (String) bag.getValue(BagKey.SURNAME);

		Customer customer = new Customer(name, surname);
		Customer createdCustomer = customerDao.create(customer);
		
		Bag createdCustomerBag = new Bag();
		createdCustomerBag.put(BagKey.ID, createdCustomer.getId());
		createdCustomerBag.put(BagKey.NAME, createdCustomer.getName());
		createdCustomerBag.put(BagKey.SURNAME, createdCustomer.getSurname());
		createdCustomerBag.put(BagKey.STATUS, createdCustomer.getStatus());

		
		return createdCustomerBag;
	}

	@Override
	public Bag update(Bag bag) {	
		long id = (long) bag.getValue(BagKey.ID);
		String name = (String) bag.getValue(BagKey.NAME);
		String surname = (String) bag.getValue(BagKey.SURNAME);			
		
		Customer customer = customerDao.update(id, name, surname);
		Bag updatedCustomerBag = new Bag();
		updatedCustomerBag.put(BagKey.ID, customer.getId());
		updatedCustomerBag.put(BagKey.NAME, customer.getName());
		updatedCustomerBag.put(BagKey.SURNAME, customer.getSurname());
		
		return updatedCustomerBag;
	}

	@Override
	public Bag list() {
		List<Customer> customers = customerDao.getCustomers();
		Bag bag = new Bag();
		bag.put(BagKey.CUSTOMERLIST, customers);
		return bag;
	}

	@Override
	public Bag delete(Bag bag) {
		long id = (long) bag.getValue(BagKey.ID);
		customerDao.delete(id);
		
		Bag deletedCustomerBag = new Bag();
		deletedCustomerBag.put(BagKey.ID, id);
		deletedCustomerBag.put(BagKey.ISSUCCESSFULL, true);
		deletedCustomerBag.put(BagKey.MESSAGE, "Success");
		
		return deletedCustomerBag;
	}
	
	@Override
	public void deleteAll() {
		CustomerDao.deleteAll();
	}

}
