package com.kurtulussahin.java.designpatterns.udemydesignpatterns.adaptor.domain.solution;

import com.kurtulussahin.java.designpatterns.udemydesignpatterns.adaptor.domain.tr.Appliance;
import com.kurtulussahin.java.designpatterns.udemydesignpatterns.adaptor.domain.tr.TurkishHomeAppliance;
import com.kurtulussahin.java.designpatterns.udemydesignpatterns.adaptor.domain.us.USPowerProvider;
import com.kurtulussahin.java.designpatterns.udemydesignpatterns.adaptor.domain.us.USPowerSource;

public class Test1 {

	public static void main(String[] args) {
		USPowerSource usPowerSource = new USPowerProvider();
		USTurkishPowerAdapter uSTurkishPowerAdapter = new USTurkishPowerAdapter(usPowerSource);
		
		System.out.println();
		
		Appliance shaver = new TurkishHomeAppliance("Shaver");
		shaver.setPowerSource(uSTurkishPowerAdapter);
		shaver.start();
		shaver.stop();
		
		System.out.println();
//		
//		Appliance turkishBroom = new TurkishHomeAppliance("Broom");
//		turkishBroom.setPowerSource(uSTurkishPowerAdapter);
//		turkishBroom.start();
//		turkishBroom.stop();
	}
}
