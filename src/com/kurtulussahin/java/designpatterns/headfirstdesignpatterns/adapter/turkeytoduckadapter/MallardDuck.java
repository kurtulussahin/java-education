package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.adapter.turkeytoduckadapter;

public class MallardDuck implements Duck {
	public void quack() {
		System.out.println("Quack");
	}
	public void fly() {
		System.out.println("I’m flying");
	}

}