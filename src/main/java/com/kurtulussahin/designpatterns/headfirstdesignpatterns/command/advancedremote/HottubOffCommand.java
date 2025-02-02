package com.kurtulussahin.designpatterns.headfirstdesignpatterns.command.advancedremote;

public class HottubOffCommand implements Command {
	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	@Override
	public void execute() {
		hottub.cool();
		hottub.off();
	}

	@Override
	public void undo() {
		hottub.on();
		hottub.heat();
		hottub.bubblesOn();
		
	}
}
