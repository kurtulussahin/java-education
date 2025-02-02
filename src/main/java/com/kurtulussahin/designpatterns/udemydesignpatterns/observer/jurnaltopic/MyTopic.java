package com.kurtulussahin.designpatterns.udemydesignpatterns.observer.jurnaltopic;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {

	private List<Observer> observers;
	
	public MyTopic(){
		this.observers=new ArrayList<>();
	}
	@Override
	public void register(Observer obj) {	
		observers.add(obj);		
	}

	@Override
	public void unregister(Observer obj) {
		observers.remove(obj);
	}

	@Override
	public void notifyObservers(String msg) {

		for (Observer obj : observers) {
			obj.update(msg);
		}

	}
	
	public void postMessage(String msg){
		System.out.println("Message Posted");
		notifyObservers(msg);
	}

}
