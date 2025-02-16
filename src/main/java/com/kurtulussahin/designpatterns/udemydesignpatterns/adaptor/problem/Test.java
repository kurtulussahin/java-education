package com.kurtulussahin.designpatterns.udemydesignpatterns.adaptor.problem;

import com.kurtulussahin.designpatterns.udemydesignpatterns.adaptor.domain.tr.TurkishPowerProvider;
import com.kurtulussahin.designpatterns.udemydesignpatterns.adaptor.domain.tr.TurkishPowerSource;
import com.kurtulussahin.designpatterns.udemydesignpatterns.adaptor.domain.us.USPowerProvider;
import com.kurtulussahin.designpatterns.udemydesignpatterns.adaptor.domain.us.USPowerSource;


public class Test {

	public static void main(String[] args) {
		TurkishPowerSource turkishPowerSource = new TurkishPowerProvider();

		// Can't have a reference of type Appliance anymore
		TurkishHomeAppliance turkishMixer = new TurkishHomeAppliance("Mixer");
		turkishMixer.setPowerSource(turkishPowerSource);
		turkishMixer.start();
		turkishMixer.stop();

		System.out.println();
		
		USPowerSource usPowerSource = new USPowerProvider();

		turkishMixer.setUSPowerSource(usPowerSource);
		turkishMixer.start();
		turkishMixer.stop();
	}
}
