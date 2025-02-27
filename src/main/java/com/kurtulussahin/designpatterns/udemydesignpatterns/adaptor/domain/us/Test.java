package com.kurtulussahin.designpatterns.udemydesignpatterns.adaptor.domain.us;

public class Test {

	public static void main(String[] args) {
		USPowerSource usPowerSource = new USPowerProvider();

		USHomeApplicance usMixer = new USHomeApplicance("Mixer");
		usMixer.setPowerSource(usPowerSource);
		usMixer.start();
		usMixer.stop();
	}
}
