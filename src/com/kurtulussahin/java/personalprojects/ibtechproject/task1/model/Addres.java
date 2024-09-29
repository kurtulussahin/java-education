package com.kurtulussahin.java.personalprojects.ibtechproject.task1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Addres {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id") 
	private long id;
	
	@Column(name="customer_id") 
	private long customerId;
	
	@Column(name="country") 
	private String country;
	
	@Column(name="city") 
	private String city;
	
	@Column(name="postal_code") 
	private String postalCode;
	
	@Column(name="status") 
	private int status;

	public Addres(long customerId, String country, String city, String postalCode) {
		super();
		this.customerId = customerId;
		this.country = country;
		this.city = city;
		this.postalCode = postalCode;
	}

	public Addres() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Addres [id=" + id + ", customerId=" + customerId + ", country=" + country + ", city=" + city
				+ ", postalCode=" + postalCode + ", status=" + status + "]";
	}


	
}
