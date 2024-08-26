package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.singleton.sample;

public class StaticSingleton {
	private static StaticSingleton uniqueInstance = new StaticSingleton();
	
	private StaticSingleton() {
		System.out.println("instance created");
	}
	
	public static StaticSingleton getInstance() {
		System.out.println("instance returned");
		return uniqueInstance;
	}
}