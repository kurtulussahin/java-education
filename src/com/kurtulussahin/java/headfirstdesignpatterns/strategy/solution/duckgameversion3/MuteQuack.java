package com.kurtulussahin.java.headfirstdesignpatterns.strategy.solution.duckgameversion3;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Can't quack");
		
	}

}
