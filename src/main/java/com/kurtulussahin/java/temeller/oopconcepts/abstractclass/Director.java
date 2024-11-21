package com.kurtulussahin.java.temeller.oopconcepts.abstractclass;


public class Director extends Manager {
	protected double bonus;
	
	public Director(int no, String name, int year, String workingDepartment, String managingDepartment, double bonus) {
		super(no, name, year, workingDepartment, managingDepartment);
		this.bonus = bonus;
	}
	
	@Override
	public void calculateSalary(){
		System.out.println("Calculating Director salary");
	}
	
}
