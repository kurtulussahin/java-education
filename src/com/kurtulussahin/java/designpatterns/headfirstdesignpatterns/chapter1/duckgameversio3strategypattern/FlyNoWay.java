package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.chapter1.duckgameversio3strategypattern;

public class FlyNoWay implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("Can't fly");
		
	}
}
