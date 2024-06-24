package com.kurtulussahin.java.headfirstdesignpatterns.strategy.solution.duckgameversion3;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Duck quack");
		
	}

}
