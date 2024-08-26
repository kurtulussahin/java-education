package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.command.advancedremote;

public class StereoOnWithCDCommand implements Command {
	
	Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	
	@Override
	public void execute() {
		System.out.println("StereoOnWithCDCommand execute");
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
	}

	@Override
	public void undo() {
		stereo.off();
		
	}

}
