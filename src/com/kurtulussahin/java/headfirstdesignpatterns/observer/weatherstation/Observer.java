package com.kurtulussahin.java.headfirstdesignpatterns.observer.weatherstation;

public interface Observer {
	public void update(float temp, float humidity, float pressure);

}
