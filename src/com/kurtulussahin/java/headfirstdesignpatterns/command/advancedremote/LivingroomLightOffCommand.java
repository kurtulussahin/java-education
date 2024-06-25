package com.kurtulussahin.java.headfirstdesignpatterns.command.advancedremote;

public class LivingroomLightOffCommand implements Command {
	Light light;

	public LivingroomLightOffCommand(Light light) {
		this.light = light;
	}
	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
		
	}
}
