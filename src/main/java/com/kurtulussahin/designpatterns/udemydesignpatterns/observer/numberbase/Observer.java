package com.kurtulussahin.designpatterns.udemydesignpatterns.observer.numberbase;

public abstract class Observer {
	protected Subject subject;
	public abstract void update();
}