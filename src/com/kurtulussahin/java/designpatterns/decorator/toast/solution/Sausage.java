package com.kurtulussahin.java.designpatterns.decorator.toast.solution;

public class Sausage extends Topping{

	public Sausage(Toastable toastTopping, String name, int price) {
		super(toastTopping, price, name);
	}
}
