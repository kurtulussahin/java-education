package com.kurtulussahin.designpatterns.headfirstdesignpatterns.strategy.duckgame.solution.duckgameversion3;

public class FlyNoWay implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("Can't fly");
		
	}
}
