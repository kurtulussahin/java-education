package com.kurtulussahin.java.designpatterns.factorymethod.solution;

public class ManagerFactory implements Factory {

	@Override
	public Manager create() {
		String department = EmployeeRandomizer.createDepartment();
		Manager manager = new Manager(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
				EmployeeRandomizer.createYear(), department, department);
		return manager;
	}
}
