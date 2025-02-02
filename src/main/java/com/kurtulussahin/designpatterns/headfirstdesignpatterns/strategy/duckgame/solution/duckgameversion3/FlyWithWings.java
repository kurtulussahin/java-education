package com.kurtulussahin.designpatterns.headfirstdesignpatterns.strategy.duckgame.solution.duckgameversion3;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("Duck fly");
		
	}

}
