package com.kurtulussahin.java.designpatterns.command;

public class DrawRectangle implements Command {
	ShapeDrafter drafter;
	public DrawRectangle(ShapeDrafter drafter){
		this.drafter = drafter;
	}
	public void execute(){
		drafter.drawRectangle();
	}
}
