package com.kurtulussahin.java.oopconcepts.abstractclass;


public class TestPayrollOffice {

	public static void main(String[] args) {
		PayrollOffice payrollOffice = new PayrollOffice();
		
		payrollOffice.paySalary(new Manager(5, "Niyazi", 13, "Sales", "Sales"));
		payrollOffice.paySalary(new Director(6, "Kenan", 22, "Management", "Management", 5000));

	}
}
