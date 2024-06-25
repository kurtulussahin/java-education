package com.kurtulussahin.java.headfirstdesignpatterns.command.advancedremote;

public class GarageDoorUpCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		System.out.println("GarageDoorUpCommand execute");
		garageDoor.up();
	}

	@Override
	public void undo() {
		garageDoor.down();
		
	}
}
