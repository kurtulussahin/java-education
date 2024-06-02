package com.kurtulussahin.java.oop.interfacedemo.calculator;


public class LogFunction extends AbstractMathFunction {

	public LogFunction(){
		super("log");
	}
	
	public double calculate(double arg) {
		return Math.log(arg);
	}
}
