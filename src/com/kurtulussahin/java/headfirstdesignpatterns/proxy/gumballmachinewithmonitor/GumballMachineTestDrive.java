package com.kurtulussahin.java.headfirstdesignpatterns.proxy.gumballmachinewithmonitor;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine("ankara", 2);
		GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		gumballMachine.refill(5);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
		
		gumballMonitor.report();
	}
}
