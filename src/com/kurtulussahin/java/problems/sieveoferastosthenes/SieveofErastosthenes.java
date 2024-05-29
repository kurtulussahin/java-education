package com.kurtulussahin.java.problems.sieveoferastosthenes;

import java.util.Arrays;

public class SieveofErastosthenes {

	public static void main(String[] args) {

		SieveofErastosthenes sieveofErastosthenes=new SieveofErastosthenes();
		sieveofErastosthenes.countNumberOfPrimesUpTo(100);
	}
	
	void countNumberOfPrimesUpTo(int number) {
		boolean[] numberList = new boolean[number+1];
		Arrays.fill(numberList, true);
		numberList[0]=false; // 0 asal değil
		numberList[1]=false; // 1 asal değil
		
		for(int i=2; i<=number; i++) {
			if(numberList[i]==true) {
				for(int j=2; i*j<=number; j++) {
					numberList[i*j]=false;
				}
			}
		}
		
		int numberOfPrimes=0;
		for(boolean b : numberList) {
			if(b) {
				numberOfPrimes++;
			}
		}
		
		System.out.println(number + "sayısına kadar " + numberOfPrimes + " adet asal vardır" );
	} 
}
