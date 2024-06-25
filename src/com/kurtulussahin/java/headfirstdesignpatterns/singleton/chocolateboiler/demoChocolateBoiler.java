package com.kurtulussahin.java.headfirstdesignpatterns.singleton.chocolateboiler;

public class demoChocolateBoiler {
	public static void main(String[] args) {

		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler = ChocolateBoiler.getInstance();
	}
}
