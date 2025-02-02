package com.kurtulussahin.designpatterns.headfirstdesignpatterns.singleton.sample;

public class Singleton {
	private static Singleton uniqueInstance;

	private Singleton() {}
	
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
			System.out.println("instance created");
		}
		System.out.println("instance returned");
		return uniqueInstance;
	}
}