package com.kurtulussahin.designpatterns.headfirstdesignpatterns.command.advancedremote;

public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	@Override
	public void execute() {
		ceilingFan.off();
	}
	@Override
	public void undo() {
		ceilingFan.high();
		
	}
}
