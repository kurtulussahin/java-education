package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.observer.weatherstation;

public interface Observer {
	public void update(float temp, float humidity, float pressure);

}