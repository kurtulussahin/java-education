package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.chapter1.duckgameversio3strategypattern;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Can't quack");
		
	}

}
