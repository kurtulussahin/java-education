package com.kurtulussahin.java.designpatterns.decorator.toast.solution;

public class Ketchup extends Topping{

	public Ketchup(Toastable toastTopping, String name, int price) {
		super(toastTopping, price, name);
	}
}
