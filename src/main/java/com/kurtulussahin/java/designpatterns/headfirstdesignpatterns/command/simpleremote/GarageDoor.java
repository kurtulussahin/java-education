package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.command.simpleremote;

public class GarageDoor {
	public void up() {
		System.out.println("Door up");
	}
	public void down() {
		System.out.println("Door down");
	}
	
	public void stop() {
		System.out.println("Door stop");
	}
	
	public void lightOn() {
		System.out.println("Door light On");
	}
	public void lightOff() {
		System.out.println("Door light Off");
	}
}
