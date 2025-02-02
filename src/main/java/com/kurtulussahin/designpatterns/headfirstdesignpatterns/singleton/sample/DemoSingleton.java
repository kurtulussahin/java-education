package com.kurtulussahin.designpatterns.headfirstdesignpatterns.singleton.sample;

public class DemoSingleton {

	public static void main(String[] args) {
		
		Singleton singletonInstance=Singleton.getInstance();
		singletonInstance=Singleton.getInstance();
		
		SynchronizedSingleton synchronizedSingletonInstance=SynchronizedSingleton.getInstance();
		synchronizedSingletonInstance=SynchronizedSingleton.getInstance();

		StaticSingleton staticSingletonInstance=StaticSingleton.getInstance();
		staticSingletonInstance=StaticSingleton.getInstance();
	}

}
