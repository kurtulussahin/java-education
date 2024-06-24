package com.kurtulussahin.java.headfirstdesignpatterns.strategy.problem.duckgameversion1;

public class RubberDuck extends Duck {

	@Override
	public void quack() {
		System.out.println("Rubber Duck Squeak");
		
	}
	
	@Override
	public void fly() {
		System.out.println("Rubber Duck does not Fly");
		
	}
	
	@Override
	public void display() {
		System.out.println("Rubber Duck Display");
		
	}

}
