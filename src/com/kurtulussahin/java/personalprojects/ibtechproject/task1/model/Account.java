package com.kurtulussahin.java.personalprojects.ibtechproject.task1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id") 
	private long id;
	
	@Column(name="customer_id") 
	private long customerId;
	
	@Column(name="account_name") 
	private String accountName;
	
	@Column(name="balance") 
	private long balance;
	
	@Column(name="status") 
	private int status;

	public Account() {
		super();
	}

	public Account(long customerId, String accountName) {
		super();
		this.customerId = customerId;
		this.accountName = accountName;
		this.balance = 0;
		this.status=1;
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

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public long getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", customerId=" + customerId + ", accountName=" + accountName + ", balance="
				+ balance + ", status=" + status + "]";
	}
	
	
}
