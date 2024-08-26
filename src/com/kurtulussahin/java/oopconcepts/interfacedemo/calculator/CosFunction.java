package com.kurtulussahin.java.oopconcepts.interfacedemo.calculator;


public class CosFunction extends AbstractMathFunction {
	
	public CosFunction(){
		super("cos");
	}
	
	public double calculate(double arg) {
		return Math.cos(arg);
	}
}
