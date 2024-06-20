package com.kurtulussahin.java.rcmartincoffemaker;

public abstract class UserInterface {
	private HotWaterSource hws;
	private ContainmentVessel cv;
	protected boolean isComplete;
	public UserInterface() {
		isComplete = true;
	}
	public void init(HotWaterSource hws, ContainmentVessel cv) {
		this.hws = hws;
		this.cv = cv;
	}
	public void complete() {
		isComplete = true;
		completeCycle();
	}
	protected void startBrewing() {
		if (hws.isReady() && cv.isReady()) {
			isComplete = false;
			hws.start();
			cv.start();
		}
	}
	public abstract void done();
	public abstract void completeCycle();
}
