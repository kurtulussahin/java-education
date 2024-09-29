package com.kurtulussahin.java.codekata.robertcmartin.rcmartincoffemaker;

public class M4ContainmentVessel extends ContainmentVessel
implements Pollable {
	private CoffeeMakerAPI api;
	private int lastPotStatus;
	public M4ContainmentVessel(CoffeeMakerAPI api) {
		this.api = api;
		lastPotStatus = api.POT_EMPTY;
	}
	public boolean isReady() {
		int plateStatus = api.getWarmerPlateStatus();
		return plateStatus == api.POT_EMPTY;
	}
	public void poll() {
		int potStatus = api.getWarmerPlateStatus();
		if (potStatus != lastPotStatus) {
			if (isBrewing) {
				handleBrewingEvent(potStatus);
			} else if (isComplete == false) {
				handleIncompleteEvent(potStatus);
			}
			lastPotStatus = potStatus;
		}
	}
	private void handleBrewingEvent(int potStatus) {
		if (potStatus == api.POT_NOT_EMPTY) {
			containerAvailable();
			api.setWarmerState(api.WARMER_ON);
		} else if (potStatus == api.WARMER_EMPTY) {
			containerUnavailable();
			api.setWarmerState(api.WARMER_OFF);
		} else { // potStatus == api.POT_EMPTY
			containerAvailable();
			api.setWarmerState(api.WARMER_OFF);
		}
	}
	private void handleIncompleteEvent(int potStatus) {
		if (potStatus == api.POT_NOT_EMPTY) {
			api.setWarmerState(api.WARMER_ON);
		} else if (potStatus == api.WARMER_EMPTY) {
			api.setWarmerState(api.WARMER_OFF);
		} else { // potStatus == api.POT_EMPTY
			api.setWarmerState(api.WARMER_OFF);
			declareComplete();
		}
	}
}