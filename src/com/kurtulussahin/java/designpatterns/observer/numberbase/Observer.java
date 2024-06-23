package com.kurtulussahin.java.designpatterns.observer.numberbase;

public abstract class Observer {
	protected Subject subject;
	public abstract void update();
}