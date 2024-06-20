package com.kurtulussahin.java.rcmartincoffemaker;

public class M4UserInterface extends UserInterface
implements Pollable {
	private CoffeeMakerAPI api;
	public M4UserInterface(CoffeeMakerAPI api) {
		this.api = api;
	}
	public void poll() {
		int buttonStatus = api.getBrewButtonStatus();
		if (buttonStatus == api.BREW_BUTTON_PUSHED) {
			startBrewing();
		}
	}
	public void done() {
		api.setIndicatorState(api.INDICATOR_ON);
	}
	public void completeCycle() {
		api.setIndicatorState(api.INDICATOR_OFF);
	}
}
