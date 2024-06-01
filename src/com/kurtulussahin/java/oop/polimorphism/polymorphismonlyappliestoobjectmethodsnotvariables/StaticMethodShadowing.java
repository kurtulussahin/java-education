package com.kurtulussahin.java.oop.polimorphism.polymorphismonlyappliestoobjectmethodsnotvariables;

public class StaticMethodShadowing {

	public static void main(String[] args) {
		Parent parent = new Child1();
		
		System.out.println(parent.anInstanceVariable);
		parent.printAnInstanceVariable();
		
	}
}
