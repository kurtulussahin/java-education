package com.kurtulussahin.java.headfirstdesignpatterns.singleton.sample;

public class SynchronizedSingleton {
	private static SynchronizedSingleton uniqueInstance;

	private SynchronizedSingleton() {}
	
	public static SynchronizedSingleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SynchronizedSingleton();
			System.out.println("instance created");
		}
		System.out.println("instance returned");
		return uniqueInstance;
	}
}