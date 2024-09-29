package com.kurtulussahin.java.temeller.collections.comperator;

import java.util.Comparator;

public class ComperatorDog implements Comparator<ComperatorDog> 
{
	private String name;
	private int age;
	
	public ComperatorDog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getDogName() {
		return name;
	}

	public int getDogAge() {
		return age;
	}

	@Override
	public int compare(ComperatorDog dog1, ComperatorDog dog2) {
		// compare the name using alphabetical order   
		return dog1.age - dog2.age;
	}

	@Override
	public String toString() {
		return this.name + "," + this.age;
	}
}
