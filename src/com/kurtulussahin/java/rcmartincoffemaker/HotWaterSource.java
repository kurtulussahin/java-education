package com.kurtulussahin.java.rcmartincoffemaker;

public abstract class HotWaterSource {
	private UserInterface ui;
	private ContainmentVessel cv;
	protected boolean isBrewing;
	public HotWaterSource() {
		isBrewing = false;
	}
	public void init(UserInterface ui, ContainmentVessel cv) {
		this.ui = ui;
		this.cv = cv;
	}
	public void start() {
		isBrewing = true;
		startBrewing();
		System.out.println("hws start()");
	}
	public void done() {
		isBrewing = false;
	}
	protected void declareDone() {
		ui.done();
		cv.done();
		isBrewing = false;
	}
	public abstract boolean isReady();
	public abstract void startBrewing();
	public abstract void pause();
	public abstract void resume();
}
