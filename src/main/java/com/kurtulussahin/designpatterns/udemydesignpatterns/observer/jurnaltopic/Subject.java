package com.kurtulussahin.designpatterns.udemydesignpatterns.observer.jurnaltopic;

public interface Subject {

	public void register(Observer obj);
	public void unregister(Observer obj);

	public void notifyObservers(String msg);

}