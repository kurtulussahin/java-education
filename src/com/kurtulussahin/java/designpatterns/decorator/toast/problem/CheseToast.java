package com.kurtulussahin.java.designpatterns.decorator.toast.problem;

public class CheseToast extends AbstractToast{

	public CheseToast() {
		name = "Chese Toast";
	}

	@Override
	public int calculatePrice() {
		return 5;
	}
}
