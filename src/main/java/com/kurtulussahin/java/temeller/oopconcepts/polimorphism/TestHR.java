package com.kurtulussahin.java.temeller.oopconcepts.polimorphism;

public class TestHR {

	public static void main(String[] args) {
		HR hr = new HR();

		Employee e = hr.getAnEmployee();
		e.work();
		System.out.println();
	}
}
