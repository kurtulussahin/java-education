package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema32;

public class varargsExample {
	
	
	static void sumTest(int ...v)
	{
		System.out.println(v.length);
		System.out.println(v[1]);
	}
	

	
	public static void main(String[] args) 
	{
		
		//sumTest();
		//sumTest(1);
		sumTest(3,2,3);
		
		
	}
	

}
