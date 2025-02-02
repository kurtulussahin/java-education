package com.kurtulussahin.designpatterns.headfirstdesignpatterns.command.simpleremote;

public class GarageDoorOpenCommand implements Command{
	GarageDoor garageDoor;
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	public void execute() {
		System.out.println("GarageDoorOpenCommand execute");
		garageDoor.up();
	}
}
