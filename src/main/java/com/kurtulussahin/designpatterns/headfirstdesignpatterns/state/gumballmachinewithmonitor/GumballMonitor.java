package com.kurtulussahin.designpatterns.headfirstdesignpatterns.state.gumballmachinewithmonitor;

public class GumballMonitor {
	GumballMachine machine;
	public GumballMonitor(GumballMachine machine) {
		this.machine = machine;
	}

	public void report() {
		System.out.println("Gumball Machine: " + machine.getLocation());
		System.out.println("Current inventory: " + machine.getCount() + " gumballs");
		System.out.println("Current state: " + machine.getState());
	}
}