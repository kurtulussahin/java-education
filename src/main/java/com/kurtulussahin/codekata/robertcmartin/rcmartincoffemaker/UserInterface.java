package com.kurtulussahin.codekata.robertcmartin.rcmartincoffemaker;

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
			System.out.println("startBrewing");
			hws.start();
			cv.start();
		}else {
			System.out.println("not ready startBrewing");
		}
	}
	public abstract void done();
	public abstract void completeCycle();
}
