package com.kurtulussahin.java.oopconcepts.interfacedemo.calculator;

public abstract class AbstractMathFunction implements MathFunction {

	protected String name;
	
	public AbstractMathFunction(String name){
		this.name = name;
	}

	@Override
	public final String getName() {
		return name;
	}
}
