package com.kurtulussahin.java.temeller.oopconcepts.interfacedemo.calculator;


public class LogFunction extends AbstractMathFunction {

	public LogFunction(){
		super("log");
	}
	
	public double calculate(double arg) {
		return Math.log(arg);
	}
}
