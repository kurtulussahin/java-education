package com.kurtulussahin.java.temeller.collections.comperable;

public class ComperableDog implements Comparable<ComperableDog> 
{
	private String name;
	private int age;
	
	public ComperableDog(String name, int age) {
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
	public int compareTo(ComperableDog dog) {
		// compare the name using alphabetical order   
		return (this.name).compareTo(dog.name);
	}

	@Override
	public String toString() {
		return this.name + "," + this.age;
	}
}
