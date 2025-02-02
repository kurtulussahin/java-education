package com.kurtulussahin.designpatterns.udemydesignpatterns.command;

import java.util.ArrayList;
import java.util.List;

public class CommandPatternExample {
	public static void main(String args[]){
		
		List<Command> commandList = new ArrayList<Command>();
		
		ShapeDrafter drafter = new ShapeDrafter();
		Command rectangleCommand = new DrawRectangle(drafter);
		Command circleCommand = new DrawCircle(drafter);
		
		
		commandList.add(circleCommand);
		commandList.add(rectangleCommand);
		
		for(Command c : commandList){
			c.execute();
		}
	}
}
