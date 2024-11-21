package com.kurtulussahin.java.problems.primenumbers;

import java.util.ArrayList;

public class PrimeNumber {

	public static void main(String[] args) {
		
		PrimeNumber primeNumber = new PrimeNumber();
		System.out.println(primeNumber.isprime(997));
		System.out.println(primeNumber.primeNumberLessThan(997));
	}
	
	boolean isprime(int number) {
		boolean prime=true;
		
		for(int i=2; i<number; i++) {
			if(number%i==0) {
				prime=false;
				break;
			}
		}
		
		return prime;
	}
	
	ArrayList<Integer> primeNumberLessThan(int number) {
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		primeNumbers.add(2);
		boolean prime=true;
		
		for(int i=3; i<=number; i++) {
			prime=true;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					prime=false;
					break;
				}	
			}
			if (prime==true) {
				primeNumbers.add(i);
			}
		}
		
		return primeNumbers;
	}

}
