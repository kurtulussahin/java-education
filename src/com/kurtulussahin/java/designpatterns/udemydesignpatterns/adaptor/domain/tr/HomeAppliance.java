package com.kurtulussahin.java.designpatterns.udemydesignpatterns.adaptor.domain.tr;

public abstract class HomeAppliance implements Appliance {
	protected TurkishPowerSource powerSource;

	@Override
	public void setPowerSource(TurkishPowerSource powerSource) {
		this.powerSource = powerSource;
	}
}
