package com.kurtulussahin.java.ibtechproject;

import java.util.Date;
import java.util.List;

public class DemoCRUD_old {
    public static void main(String[] args) {
        
//        AccountDAO accountDAO = new AccountDAO();
//        AddressDAO addressDAO = new AddressDAO();
//        PhoneDAO phoneDAO = new PhoneDAO();

        // Create Customer
        Customer newCustomer = new Customer();
        newCustomer.setFirstName("John");
        newCustomer.setLastName("Doe");
        newCustomer.setDateOfBirth(new Date());
        newCustomer.setEmail("john.doe@example.com");
        newCustomer.setNationality("USA");
        newCustomer.setCreatedDate(new Date());
        newCustomer.setStatus("Aktif");
        IDAO customerDAO = new CustomerDAO(newCustomer);

        customerDAO.save();

        // Read Customer
      //  Customer customer = customerDAO.getCustomer(newCustomer.getCustomerID());
      //  System.out.println("Customer: " + customer.getFirstName() + " " + customer.getLastName());

        // Update Customer
        //customer.setEmail("john.doe@newemail.com");
        //customerDAO.updateCustomer(customer);

        // List All Customers
       // List<Customer> customers = customerDAO.getAllCustomers();
      //  customers.forEach(c -> System.out.println("Customer: " + c.getFirstName() + " " + c.getLastName()));
//
//        // Create Account
//        Account newAccount = new Account();
//        newAccount.setCustomer(newCustomer);
//        newAccount.setAccountType("Savings");
//        newAccount.setBalance(1000.0);
//        newAccount.setCurrency("USD");
//        newAccount.setOpenDate(new Date());
//        newAccount.setStatus("Aktif");
//
//        accountDAO.saveAccount(newAccount);
//
//        // Read Account
//        Account account = accountDAO.getAccount(newAccount.getAccountID());
//        System.out.println("Account: " + account.getAccountType() + " Balance: " + account.getBalance());
//
//        // Update Account
//        account.setBalance(2000.0);
//        accountDAO.updateAccount(account);
//
//        // List All Accounts
//        List<Account> accounts = accountDAO.getAllAccounts();
//        accounts.forEach(a -> System.out.println("Account: " + a.getAccountType() + " Balance: " + a.getBalance()));
//
//        // Create Address
//        Address newAddress = new Address();
//        newAddress.setCustomer(newCustomer);
//        newAddress.setAddressLine1("123 Main St");
//        newAddress.setCity("Anytown");
//        newAddress.setState("Anystate");
//        newAddress.setPostalCode("12345");
//        newAddress.setCountry("USA");
//
//        addressDAO.saveAddress(newAddress);
//
//        // Read Address
//        Address address = addressDAO.getAddress(newAddress.getAddressID());
//        System.out.println("Address: " + address.getAddressLine1() + " " + address.getCity());
//
//        // Update Address
//        address.setCity("Newtown");
//        addressDAO.updateAddress(address);
//
//        // List All Addresses
//        List<Address> addresses = addressDAO.getAllAddresses();
//        addresses.forEach(a -> System.out.println("Address: " + a.getAddressLine1() + " " + a.getCity()));
//
//        // Create Phone
//        Phone newPhone = new Phone();
//        newPhone.setCustomer(newCustomer);
//        newPhone.setPhoneNumber("555-5678");
//        newPhone.setPhoneType("Work");
//
//        phoneDAO.savePhone(newPhone);
//
//        // Read Phone
//        Phone phone = phoneDAO.getPhone(newPhone.getPhoneID());
//        System.out.println("Phone: " + phone.getPhoneNumber() + " Type: " + phone.getPhoneType());
//
//        // Update Phone
//        phone.setPhoneNumber("555-8765");
//        phoneDAO.updatePhone(phone);
//
//        // List All Phones
//        List<Phone> phones = phoneDAO.getAllPhones();
//        phones.forEach(p -> System.out.println("Phone: " + p.getPhoneNumber() + " Type: " + p.getPhoneType()));
//
//        // Delete Operations
//        // Delete Account
//        accountDAO.deleteAccount(account.getAccountID());
//
//        // Delete Address
//        addressDAO.deleteAddress(address.getAddressID());
//
//        // Delete Phone
//        phoneDAO.deletePhone(phone.getPhoneID());
//
//        // Delete Customer (this will cascade delete related accounts, addresses, and phones if cascade options are set)
//        customerDAO.deleteCustomer(customer.getCustomerID());
    }
}
