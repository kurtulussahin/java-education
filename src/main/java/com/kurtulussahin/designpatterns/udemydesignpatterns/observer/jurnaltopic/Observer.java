package com.kurtulussahin.designpatterns.udemydesignpatterns.observer.jurnaltopic;

public interface Observer {
	
	//method to update the observer, used by subject
	public void update(String msg);
	
}