package com.kurtulussahin.java.temeller.inheritence;

public class Employee {
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
	
	public void work(){
		System.out.println("Employee is working!");
	}
	
//	public void work(int hour){
//		System.out.println("Employee is working for " + hour + " hours!");
//	}

	public double calculateSalary(){
		return year * BASE_SALARY;
	}
	
	public void printInfo(){
		System.out.println("\nNo: " + no);
		System.out.println("Name:" + name);
		System.out.println("Year: " + year);
		System.out.println("Department: " + department);
	}
}
