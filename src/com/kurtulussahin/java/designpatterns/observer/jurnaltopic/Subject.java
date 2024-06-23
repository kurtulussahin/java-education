package com.kurtulussahin.java.designpatterns.observer.jurnaltopic;

public interface Subject {

	public void register(Observer obj);
	public void unregister(Observer obj);

	public void notifyObservers(String msg);

}