package com.kurtulussahin.designpatterns.udemydesignpatterns.factory.factorymethod.problem;

public class PayrollOffice {

	public void paySalary(Employee employee) {
		String type = employee.getType();
		String name = employee.getName();
		String department = employee.getDepartment();
		double salary = employee.calculateSalary();
		
		System.out.println("Paying " + salary + " to " + type + " " + name + " in " + department);
	}
}
