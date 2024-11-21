package com.kurtulussahin.java.temeller.oopconcepts.interfacedemo.calculator;


public class SinFunction extends AbstractMathFunction  {
	
	public SinFunction(){
		super("sin");
	}
	
	public double calculate(double arg) {
		return Math.sin(arg);
	}
}
