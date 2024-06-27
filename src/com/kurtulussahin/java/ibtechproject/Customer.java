package com.kurtulussahin.java.ibtechproject;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Customer")
public class Customer implements IModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customerid")
	private int customerID;

	@Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "dateofbirth")
    private Date dateOfBirth;

    @Column(name = "email")
    private String email;
    
    @Column(name = "nationality")
	private String nationality;
    @Column(name = "createdDate")
	private Date createdDate;
    @Column(name = "updatedDate")
	private Date updatedDate;
    @Column(name = "status")
	private String status;

	int getCustomerID() {
		return customerID;
	}
	void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	String getFirstName() {
		return firstName;
	}
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	String getLastName() {
		return lastName;
	}
	void setLastName(String lastName) {
		this.lastName = lastName;
	}
	Date getDateOfBirth() {
		return dateOfBirth;
	}
	void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	String getEmail() {
		return email;
	}
	void setEmail(String email) {
		this.email = email;
	}

	String getNationality() {
		return nationality;
	}
	void setNationality(String nationality) {
		this.nationality = nationality;
	}
	Date getCreatedDate() {
		return createdDate;
	}
	void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	Date getUpdatedDate() {
		return updatedDate;
	}
	void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	String getStatus() {
		return status;
	}
	void setStatus(String status) {
		this.status = status;
	}

}
