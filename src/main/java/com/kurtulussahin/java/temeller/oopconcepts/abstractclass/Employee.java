package com.kurtulussahin.java.temeller.oopconcepts.abstractclass;

public abstract class Employee{
	protected int no;
	protected String name;
	protected int year;
	protected String department;
	
	public static final int BASE_SALARY = 500;
	
	public Employee(int no, String name, int year, String department){
		this.no = no;
		this.name = name;
		this.year = year;
		this.department = department;
	}
	public Employee(int no, String name, int year){
		this(no, name, year, null);
	}
	public abstract void calculateSalary();

	
}
