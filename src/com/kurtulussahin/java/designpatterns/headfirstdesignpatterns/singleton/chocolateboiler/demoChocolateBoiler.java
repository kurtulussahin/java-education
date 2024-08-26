package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.singleton.chocolateboiler;

public class demoChocolateBoiler {
	public static void main(String[] args) {

		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler = ChocolateBoiler.getInstance();
	}
}
