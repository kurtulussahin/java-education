package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.command.advancedremote;

public class HottubOnCommand implements Command {
	Hottub hottub;

	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	@Override
	public void execute() {
		hottub.on();
		hottub.heat();
		hottub.bubblesOn();
	}

	@Override
	public void undo() {
		hottub.cool();
		hottub.off();
		
	}
}
