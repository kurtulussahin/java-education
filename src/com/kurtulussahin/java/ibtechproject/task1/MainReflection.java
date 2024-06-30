package com.kurtulussahin.java.ibtechproject.task1;

import java.util.List;

import com.kurtulussahin.java.ibtechproject.task1.bag.Bag;
import com.kurtulussahin.java.ibtechproject.task1.bag.BagKey;
import com.kurtulussahin.java.ibtechproject.task1.cmd.CommandExecuter;
import com.kurtulussahin.java.ibtechproject.task1.model.Account;
import com.kurtulussahin.java.ibtechproject.task1.model.Customer;

public class MainReflection {
	
	public static void main(String[] args) throws Exception {
		
		deleteAllRows();
		CutomerCreateTest();
		AccountCreateTest();


	}


	
	public static void deleteAllRows() throws Exception {
		Bag emptyBag = new Bag();
		CommandExecuter.execute("delete_all_customers", emptyBag);
		CommandExecuter.execute("delete_all_accounts", emptyBag);
	}
	public static long AccountCreateTest() throws Exception {
		Account account; 
		Bag bagAdd = new Bag();
		bagAdd.put(BagKey.NAME, "test");
		bagAdd.put(BagKey.SURNAME, "test");

		Bag customerBag = CommandExecuter.execute("customer_add", bagAdd);
		long customerId = (long) customerBag.getValue(BagKey.ID);
		
		bagAdd = new Bag();
		bagAdd.put(BagKey.CUSTOMERID, customerId);
		bagAdd.put(BagKey.ACCOUNTNAME, "MAIN");
		
		Bag accountBag = CommandExecuter.execute("account_add", bagAdd);
		
		Bag bagUpdate = new Bag();
		long accountId = (long) accountBag.getValue(BagKey.ID);
		bagUpdate.put(BagKey.ACCOUNTID, accountId);
		bagUpdate.put(BagKey.ACCOUNTNAME, "Updated MAIN");
		bagUpdate.put(BagKey.BALANCE, 100L);
		bagUpdate.put(BagKey.STATUS, 0);

		Bag updatedBag = CommandExecuter.execute("account_update", bagUpdate);
		
		return (long) accountBag.getValue(BagKey.ID);
	}
	
	public static void CutomerCreateTest() throws Exception {
		Bag bagAdd = new Bag();
		bagAdd.put(BagKey.NAME, "Kurtuluş");
		bagAdd.put(BagKey.SURNAME, "Şahin");

		Bag customerBag = CommandExecuter.execute("customer_add", bagAdd);
		
	
		bagAdd.put(BagKey.NAME, "test");
		bagAdd.put(BagKey.SURNAME, "test");

		customerBag = CommandExecuter.execute("customer_add", bagAdd);
 
		
		Bag bagUpdate = new Bag();
		long id = (long) customerBag.getValue(BagKey.ID);
		bagUpdate.put(BagKey.ID, id);
		bagUpdate.put(BagKey.NAME, "Updated test");
		bagUpdate.put(BagKey.SURNAME, "Updated test");

		Bag updatedBag = CommandExecuter.execute("customer_update", bagUpdate);

		

//		Bag bagDelete = new Bag();
//		long customerId = (long) customerBag.getValue(BagKey.ID);
//		bagDelete.put(BagKey.ID, customerId);
//		Bag deletedCustomerBag = CommandExecuter.execute("customer_delete", bagDelete);

		

		Bag customersBag = CommandExecuter.execute("customer_list", new Bag());
		List<Customer> customers = (List<Customer>) customersBag.getValue(BagKey.CUSTOMERLIST);

		for (Customer customerItem : customers) {
			System.out.print("--> Id: " + customerItem.getId());
			System.out.print(" Name: " + customerItem.getName());
			System.out.println(" Surname: " + customerItem.getSurname());
		}	
	}

}
