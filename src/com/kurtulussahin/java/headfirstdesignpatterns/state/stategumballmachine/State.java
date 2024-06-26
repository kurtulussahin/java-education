package com.kurtulussahin.java.headfirstdesignpatterns.state.stategumballmachine;

public interface State {
 
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
	
	public void refill();
}
