package com.kurtulussahin.designpatterns.headfirstdesignpatterns.strategy.duckgame.solution.duckgameversion3;

public class FlyRocketPowered implements FlyBehavior {
	public void fly() {
		System.out.println("I’m flying with a rocket!");
	}
}
