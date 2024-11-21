package com.kurtulussahin.java.designpatterns.udemydesignpatterns.adaptor.domain.tr;

public interface Appliance {
	
	public void setPowerSource(TurkishPowerSource powerSource);
	
	public void start();
	
	public void stop();

}
