package com.kurtulussahin.designpatterns.headfirstdesignpatterns.command.advancedremote;

public class CeilingFanOnCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	@Override
	public void execute() {
		ceilingFan.high();
	}
	@Override
	public void undo() {
		ceilingFan.off();
		
	}
}
