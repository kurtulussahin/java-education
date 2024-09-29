package com.kurtulussahin.java.codekata.robertcmartin.rcmartincoffemaker;

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
		}else {
			System.out.println("buttonStatus=0");
		}
	}
	public void done() {
		api.setIndicatorState(api.INDICATOR_ON);
	}
	public void completeCycle() {
		api.setIndicatorState(api.INDICATOR_OFF);
	}
}
