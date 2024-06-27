package com.kurtulussahin.java.ibtechproject;

import javax.persistence.*;

@Entity
@Table(name = "Address")
public class Address {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int addressID;

    @ManyToOne
    @JoinColumn(name = "customerID")
    private Customer customer;

    private String addressLine1;
    private String addressLine2;
    private String addressType;
    private String city;
    private String state;
    private String postalCode;
    private String country;
	int getAddressID() {
		return addressID;
	}
	void setAddressID(int addressID) {
		this.addressID = addressID;
	}
	Customer getCustomer() {
		return customer;
	}
	void setCustomer(Customer customer) {
		this.customer = customer;
	}
	String getAddressLine1() {
		return addressLine1;
	}
	void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	String getAddressLine2() {
		return addressLine2;
	}
	void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	String getCity() {
		return city;
	}
	void setCity(String city) {
		this.city = city;
	}
	String getState() {
		return state;
	}
	void setState(String state) {
		this.state = state;
	}
	String getPostalCode() {
		return postalCode;
	}
	void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	String getCountry() {
		return country;
	}
	void setCountry(String country) {
		this.country = country;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

    
}
