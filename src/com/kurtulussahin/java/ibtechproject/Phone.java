package com.kurtulussahin.java.ibtechproject;

import javax.persistence.*;

@Entity
@Table(name = "Phone")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int phoneID;

    @ManyToOne
    @JoinColumn(name = "customerID")
    private Customer customer;

    private String phoneNumber;
    private String phoneType;
    private String countrycode;
	int getPhoneID() {
		return phoneID;
	}
	void setPhoneID(int phoneID) {
		this.phoneID = phoneID;
	}
	Customer getCustomer() {
		return customer;
	}
	void setCustomer(Customer customer) {
		this.customer = customer;
	}
	String getPhoneNumber() {
		return phoneNumber;
	}
	void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	String getPhoneType() {
		return phoneType;
	}
	void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

    
}