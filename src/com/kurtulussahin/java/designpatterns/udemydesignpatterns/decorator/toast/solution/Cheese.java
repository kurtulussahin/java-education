package com.kurtulussahin.java.designpatterns.udemydesignpatterns.decorator.toast.solution;

public class Cheese extends Topping{

	public Cheese(Toastable toastTopping, String name, int price) {
		super(toastTopping, price, name);
	}
}
