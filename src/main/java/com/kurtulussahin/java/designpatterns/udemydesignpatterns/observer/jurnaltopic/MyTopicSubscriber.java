package com.kurtulussahin.java.designpatterns.udemydesignpatterns.observer.jurnaltopic;

public class MyTopicSubscriber implements Observer {
	
	private String name;
	
	public MyTopicSubscriber(String nm){
		this.name=nm;
	}
	@Override
	public void update(String msg) {
		System.out.println(name+":: new message::"+msg);
	}


}
