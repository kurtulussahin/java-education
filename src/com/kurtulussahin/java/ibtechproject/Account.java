package com.kurtulussahin.java.ibtechproject;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountID;

    @ManyToOne
    @JoinColumn(name = "customerID")
    private Customer customer;

    private String accountType;
    private double balance;
    private String currency;
    private Date openDate;
    private Date closeDate;
    private String status;
    private int branchID;
    private Date updatedDate;
	int getAccountID() {
		return accountID;
	}
	void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	Customer getCustomer() {
		return customer;
	}
	void setCustomer(Customer customer) {
		this.customer = customer;
	}
	String getAccountType() {
		return accountType;
	}
	void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	double getBalance() {
		return balance;
	}
	void setBalance(double balance) {
		this.balance = balance;
	}
	String getCurrency() {
		return currency;
	}
	void setCurrency(String currency) {
		this.currency = currency;
	}
	Date getOpenDate() {
		return openDate;
	}
	void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	Date getCloseDate() {
		return closeDate;
	}
	void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}
	String getStatus() {
		return status;
	}
	void setStatus(String status) {
		this.status = status;
	}
	
	int getBranchID() {
		return branchID;
	}
	void setBranchID(int branchID) {
		this.branchID = branchID;
	}
	Date getUpdatedDate() {
		return updatedDate;
	}
	void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
    
    
}