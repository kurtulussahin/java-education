package com.kurtulussahin.java.headfirstdesignpatterns.strategy.problem.duckgameversion1;

public class DecoyDuck extends Duck {

	@Override
	public void quack() {
		System.out.println("Decoy Duck does not quack");
		
	}
	
	@Override
	public void fly() {
		System.out.println("Decoy Duck does not Fly");
		
	}
	
	@Override
	public void display() {
		System.out.println("Decoy Duck Display");
		
	}

}