package com.kurtulussahin.java.headfirstdesignpatterns.strategy.solution.duckgameversion3;

public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	@Override
	public void display() {
		System.out.println("Decoy Duck Display");
		
	}

}
