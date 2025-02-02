package com.kurtulussahin.designpatterns.udemydesignpatterns.decorator.toast.solution;

public class Ketchup extends Topping{

	public Ketchup(Toastable toastTopping, String name, int price) {
		super(toastTopping, price, name);
	}
}
