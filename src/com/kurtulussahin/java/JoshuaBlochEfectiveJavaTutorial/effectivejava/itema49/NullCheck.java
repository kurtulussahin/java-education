package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema49;

import java.util.Objects;

public class NullCheck {
	
	String something;
	
	public static void nullCheck(String something) {
		String aString = Objects.requireNonNull(something);
	}
	
	public static void main(String[] args) {
		
		nullCheck(null);
		
	}

}
