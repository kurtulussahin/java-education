package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.chapter1.duckgameversio3strategypattern;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("Duck fly");
		
	}

}
