package com.kurtulussahin.designpatterns.udemydesignpatterns.command;

public class DrawCircle implements Command {
	ShapeDrafter drafter;
	public DrawCircle(ShapeDrafter drafter){
		this.drafter = drafter;
	}
	public void execute(){
		drafter.drawCircle();
	}
}
