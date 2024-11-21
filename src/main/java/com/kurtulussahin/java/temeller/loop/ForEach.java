package com.kurtulussahin.java.temeller.loop;

public class ForEach {

	public static void main(String[] args) {
		
		int[] intArray = new int[100];

		for (int i = 0; i < intArray.length; i++) {	
			int sayi = (int)(Math.random()*100);
			intArray[i] = sayi;
		}

		for (int i : intArray) {
			System.out.print(i + " ");
		}

	}

}
