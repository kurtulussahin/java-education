package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.chapter1.duckgameversio3strategypattern;

public class Squeak implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Duck Squeak");
	}

}
