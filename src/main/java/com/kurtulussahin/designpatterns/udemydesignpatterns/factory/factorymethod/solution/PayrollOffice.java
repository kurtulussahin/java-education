package com.kurtulussahin.designpatterns.udemydesignpatterns.factory.factorymethod.solution;

/**
 * A class that represents the payroll office in a company.
 * @author akin
 *
 */
public class PayrollOffice {

	public void paySalary(Employee employee) {
		String name = employee.getName();
		String department = employee.getDepartment();
		double salary = employee.calculateSalary();
		
		System.out.println("Paying " + salary + " to " + name + " in " + department);
	}
}
