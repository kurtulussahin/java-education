package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.itema39.markerannotation;

//Program containing marker annotations (Page 181)
public class SampleClass {

	int aVariable=0;

	public SampleClass(int aVariable) {
		this.aVariable = aVariable;
	}

	public int getaVariable() {
		return aVariable;
	}

	public void setaVariable(int aVariable) {
		this.aVariable = aVariable;
	}

	@Override
	public String toString() {
		return "SampleClass{" +
				"aVariable=" + aVariable +
				'}';
	}
}