package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.observer.weatherstation;

public interface Subject {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	
	public void notifyObservers();
}
