package com.kurtulussahin.java.designpatterns.adaptor.problem;

import  com.kurtulussahin.java.designpatterns.adaptor.domain.tr.*;
import  com.kurtulussahin.java.designpatterns.adaptor.domain.us.*;


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
