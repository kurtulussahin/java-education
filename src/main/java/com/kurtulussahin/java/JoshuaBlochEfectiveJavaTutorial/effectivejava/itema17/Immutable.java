package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema17;

public class Immutable {
	
	private final int value;

	public Immutable(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	// read only
	
}