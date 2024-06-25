package com.kurtulussahin.java.headfirstdesignpatterns.observer.weatherstation;

public interface Subject {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	
	public void notifyObservers();
}
