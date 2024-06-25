package com.kurtulussahin.java.headfirstdesignpatterns.command.advancedremote;

public class Stereo {
	int volume;
	String location;

	public Stereo(String location) {
		this.location = location;
	}
	
	public void on() {
		System.out.println("Stereo on");
	}
	public void off(){
		System.out.println("Stereo off");
	}
	public void setCd(){
		System.out.println("Stereo setCd");
	}
	public void setDvd(){
		System.out.println("Stereo setDvd");
	}
	public void setRadio(){
		System.out.println("Stereo setRadio");
	}
	public void setVolume(int level){
		volume=level;
		System.out.println("Stereo setVolume"+ level);
	}
}
