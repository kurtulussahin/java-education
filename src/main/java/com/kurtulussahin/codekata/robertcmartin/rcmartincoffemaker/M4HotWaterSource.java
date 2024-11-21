package com.kurtulussahin.codekata.robertcmartin.rcmartincoffemaker;

public class M4HotWaterSource extends HotWaterSource
implements Pollable {
	private CoffeeMakerAPI api;
	public M4HotWaterSource(CoffeeMakerAPI api) {
		this.api = api;
	}
	public boolean isReady() {
		int boilerStatus = api.getBoilerStatus();
		return boilerStatus == api.BOILER_NOT_EMPTY;
	}
	public void startBrewing() {
		api.setReliefValveState(api.VALVE_CLOSED);
		api.setBoilerState(api.BOILER_ON);
	}
	public void poll() {
		int boilerStatus = api.getBoilerStatus();
		if (isBrewing) {
			if (boilerStatus == api.BOILER_EMPTY) {
				api.setBoilerState(api.BOILER_OFF);
				api.setReliefValveState(api.VALVE_CLOSED);
				declareDone();
			}
		}
	}
	public void pause() {
		api.setBoilerState(api.BOILER_OFF);
		api.setReliefValveState(api.VALVE_OPEN);
	}
	public void resume() {
		api.setBoilerState(api.BOILER_ON);
		api.setReliefValveState(api.VALVE_CLOSED);
	}
}
