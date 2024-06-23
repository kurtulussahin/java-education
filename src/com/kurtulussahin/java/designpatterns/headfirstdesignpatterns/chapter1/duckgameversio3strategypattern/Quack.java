package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.chapter1.duckgameversio3strategypattern;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Duck quack");
		
	}

}
