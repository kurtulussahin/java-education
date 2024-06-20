
package com.kurtulussahin.java.designpatterns.factorymethod.blochsolution;

public class Test {

	public static void main(String[] args) {
		Employee newEmployee = Employee.createNewTemporaryEmployee(4, "Ali");
	}
}
