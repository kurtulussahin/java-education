package com.kurtulussahin.java.oop.polimorphism.polymorphismonlyappliestoobjectmethodsnotvariables;

public class Child1 extends Parent{
	public String anInstanceVariable = "Child1's instance variable";
	
	@Override
	public void printAnInstanceVariable() {
		System.out.println(anInstanceVariable);
	}

}
