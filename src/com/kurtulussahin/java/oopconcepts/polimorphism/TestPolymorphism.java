package com.kurtulussahin.java.oopconcepts.polimorphism;


public class TestPolymorphism {

	public static void main(String[] args) {
		System.out.println("Non polimorphic assignments");
		Employee e = new Employee(1, "Ali", 8, "Production");
		e.work();
		
		Manager m = new Manager(2, "Fatma", 3, "Production", "Production");
		m.work();

		Director d = new Director(4, "Mehmet", 20, "Management", "Management", 3000);
		d.work();

		
		System.out.println();
		System.out.println("Polimorphic assignments");

		Employee e1 = new Employee(1, "Ali", 8, "Production");
		e1.work();
		System.out.println();
		
		e1 = new Manager(2, "Fatma", 3, "Production", "Production");
		e1.work();
		System.out.println();
		
		e1 = new Director(4, "Mehmet", 20, "Management", "Management", 3000);
		e1.work();
	
	}
}
