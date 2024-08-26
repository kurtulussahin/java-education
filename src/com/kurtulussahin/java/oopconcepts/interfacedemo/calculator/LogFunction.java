package com.kurtulussahin.java.oopconcepts.interfacedemo.calculator;


public class LogFunction extends AbstractMathFunction {

	public LogFunction(){
		super("log");
	}
	
	public double calculate(double arg) {
		return Math.log(arg);
	}
}
