package com.kurtulussahin.java.headfirstdesignpatterns.command.simpleremote;

public class LightOnCommand implements Command {
	Light light;
	public LightOnCommand(Light light) {
		this.light = light;
	}
	public void execute() {
		System.out.println("LightOnCommand execute");
		light.on();
	}
}
