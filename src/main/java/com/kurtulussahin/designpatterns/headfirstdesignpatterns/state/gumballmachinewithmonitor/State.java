package com.kurtulussahin.designpatterns.headfirstdesignpatterns.state.gumballmachinewithmonitor;

public interface State {
 
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
	
	public void refill();
}
