package com.kurtulussahin.designpatterns.udemydesignpatterns.adaptor.domain.solution;

import com.kurtulussahin.designpatterns.udemydesignpatterns.adaptor.domain.tr.TurkishPowerSource;
import com.kurtulussahin.designpatterns.udemydesignpatterns.adaptor.domain.us.USPowerSource;

public class USTurkishPowerAdapter implements TurkishPowerSource {
	private USPowerSource usPowerSource;
	private boolean on;

	public USTurkishPowerAdapter(USPowerSource usPowerSource) {
		System.out.println("\nUSTurkishPowerAdapter: Converting from USPowerSource to TurkishPowerSource");
		this.usPowerSource = usPowerSource;
//		convert110To220(usPowerSource);
	}

	@Override
	public void providePowerAt220V() {
		usPowerSource.providePowerAt110V();
		convert110To220(usPowerSource);
	}

	@Override
	public void turnOn() {
		if (!on) {
			usPowerSource.pushSwitch();
			on = true;
		}
	}

	@Override
	public void turnOff() {
		if (on) {
			usPowerSource.pushSwitch();
			on = false;
		}
	}

	private void convert110To220(USPowerSource usPowerSource) {
		System.out.println("USTurkishPowerAdapter: Converting from 110V to 220V");
	}
}
