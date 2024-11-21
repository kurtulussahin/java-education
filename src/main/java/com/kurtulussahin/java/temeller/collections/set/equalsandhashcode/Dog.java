package com.kurtulussahin.java.temeller.collections.set.equalsandhashcode;

public class Dog
{
	private String name;
	private int age;
	
	public Dog(String name, int age) {
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
	public String toString() {
		return this.name + "," + this.age;
	}
	
	   @Override
	   public boolean equals(Object o) {
		   
	      if (this.toString().equals(o.toString())) {
	         return true;
	      }
	      else {
	         return false;
	      }
	   }
	   @Override
	   public int hashCode() {
		  int result=this.toString().hashCode();
	      return result;
	   }
}
