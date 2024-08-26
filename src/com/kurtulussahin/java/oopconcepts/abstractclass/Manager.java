package com.kurtulussahin.java.oopconcepts.abstractclass;


public class Manager extends Employee{
	protected String departmentManaged;
	
	public Manager(int no, String name, int year, String workingDepartment, String departmentManaged){
		super(no, name, year, workingDepartment);
		this.departmentManaged = departmentManaged;
	}
	
	public Manager(int no, String name, int year, String departmentManaged){
		super(no, name, year);
		this.departmentManaged = departmentManaged;
	}
	
	@Override
	public void calculateSalary(){
		System.out.println("Calculating Manager salary");
	}


}
