package com.kurtulussahin.java.temeller.array;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		
		int[] demoArray = new int[100];
		
		Arrays.fill(demoArray, 0);
		
		for(int i=0; i<demoArray.length; i++) {
			System.out.println(demoArray[i]);
			demoArray[i]=i*100;
		}
		
		Arrays.sort(demoArray);
		System.out.println(Arrays.binarySearch(demoArray, 500));
		

	}

}
