package com.kurtulussahin.java.designpatterns.decorator.toast.solution;

import java.util.ArrayList;
import java.util.List;

public class ToastBread implements Toastable {
	private static String name;
	protected int price;
	
	public ToastBread(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public int calculatePrice() {
		return price;
	}

	@Override
	public List<Topping> getToppings() {
		return new ArrayList<Topping>();
	}
}
