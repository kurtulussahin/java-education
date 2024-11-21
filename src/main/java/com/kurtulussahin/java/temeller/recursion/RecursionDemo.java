package com.kurtulussahin.java.temeller.recursion;

public class RecursionDemo {

	public static void main(String[] args) {
		
		System.out.println("calculateFactorialRecursive: " + calculateFactorialRecursive(10));
		System.out.println("calculateFactorialByFor: " + calculateFactorialByFor(10));
		
	}
	
	public static long calculateFactorialRecursive(int n){
		long factorial = 1;
		if (n == 1)
			factorial = 1;
		else
			factorial = n * calculateFactorialRecursive(n-1);
		return factorial;
	}
	
	public static long calculateFactorialByFor(int n) {
		long factorial = 1;
		for (int i = 1; i <= n; i++)
			factorial *= i;
		return factorial;
	}

}
