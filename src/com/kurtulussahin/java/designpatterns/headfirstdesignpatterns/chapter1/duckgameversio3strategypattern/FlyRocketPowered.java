package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.chapter1.duckgameversio3strategypattern;

public class FlyRocketPowered implements FlyBehavior {
	public void fly() {
		System.out.println("I’m flying with a rocket!");
	}
}
