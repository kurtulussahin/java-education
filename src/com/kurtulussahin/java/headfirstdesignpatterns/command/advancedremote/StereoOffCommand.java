package com.kurtulussahin.java.headfirstdesignpatterns.command.advancedremote;

public class StereoOffCommand implements Command {
	Stereo stereo;
 
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	@Override
	public void execute() {
		stereo.off();
	}

	@Override
	public void undo() {
		System.out.println("StereoOnWithCDCommand execute");
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
		
	}
}
