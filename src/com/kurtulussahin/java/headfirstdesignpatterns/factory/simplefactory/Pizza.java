package com.kurtulussahin.java.headfirstdesignpatterns.factory.simplefactory;

public abstract class Pizza {
	
	public abstract void prepare();
	
	public void bake() {
		System.out.println("Bake Pizza" );
		
	}
	
	public void cut() {
		System.out.println("Cut Pizza" );
		
	}
	
	public void box() {
		System.out.println("Box Pizza" );
		
	}
}