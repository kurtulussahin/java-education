package com.kurtulussahin.java.temeller.oopconcepts.polimorphism.polymorphismonlyappliestoobjectmethodsnotvariables;

public class StaticMethodShadowing {

	public static void main(String[] args) {
		Parent parent = new Child1();
		
		System.out.println(parent.anInstanceVariable);
		parent.printAnInstanceVariable();
		
	}
}