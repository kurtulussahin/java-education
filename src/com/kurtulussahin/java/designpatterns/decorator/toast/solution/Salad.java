package com.kurtulussahin.java.designpatterns.decorator.toast.solution;

public class Salad extends Topping{

	public Salad(Toastable toastTopping, String name, int price) {
		super(toastTopping, price, name);
	}
}
