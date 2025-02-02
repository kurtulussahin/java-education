package com.kurtulussahin.designpatterns.udemydesignpatterns.facade.computer;

public class Client {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.start();
	}
}
