package com.kurtulussahin.java.designpatterns.adaptor.problem;

import  com.kurtulussahin.java.designpatterns.adaptor.domain.tr.*;
import  com.kurtulussahin.java.designpatterns.adaptor.domain.us.*;

public class TurkishHomeAppliance extends HomeAppliance {
	private String name;
	private USPowerSource usPowerSource;
	private boolean turkishPowerSource;

	public TurkishHomeAppliance(String name) {
		this.name = name;
	}

	@Override
	public void setPowerSource(TurkishPowerSource powerSource) {
		this.powerSource = powerSource;
		turkishPowerSource = true;
	}

	public void setUSPowerSource(USPowerSource usPowerSource) {
		this.usPowerSource = usPowerSource;
		turkishPowerSource = false;
	}

	@Override
	public void start() {
		System.out.println("TurkishHomeAppliance " + name + " is starting!");
		if (turkishPowerSource)
			powerSource.turnOn();
		else
			usPowerSource.pushSwitch();
	}

	@Override
	public void stop() {
		System.out.println("TurkishHomeAppliance " + name + " stoping!");
		if (turkishPowerSource)
			powerSource.turnOff();
		else
			usPowerSource.pushSwitch();
	}
}
