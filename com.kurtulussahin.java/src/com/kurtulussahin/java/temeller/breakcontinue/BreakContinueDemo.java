package com.kurtulussahin.java.temeller.breakcontinue;

public class BreakContinueDemo {

	public static void main(String[] args) {
		
		System.out.println("Continue: ");
		for (int i = 1; i <= 5; ++i) {
			if (i == 4)
				continue; 
			System.out.println(i + "\t" + Math.sqrt(i));
		} 
		
		System.out.println("Break: ");
		for (int i = 1; i <= 5; i++) {
			if (i == 4)
				break;
			System.out.println(i + "\t" + Math.sqrt(i));
		}
		
		System.out.println("I'm here.");
		
		System.out.println("Labeled Break: ");
		int[][] arrayOfInts = { { 32, 87,   3,    589}, 
                				{ 12, 1076, 2000, 12 }, 
                				{ 622, 127, 12,   12 } };
		int searchfor = 12;
		
		int i = 0;
		int j = 0;
		boolean foundIt = false;
		
		here : for (; i < arrayOfInts.length; i++) {
					for (j = 0; j < arrayOfInts[i].length; j++) {
						if (arrayOfInts[i][j] == searchfor) {
							foundIt = true;
							System.out.println("Found " + searchfor + " at " + i + ", " + j);
							break here;
						}
					}
		}
		
		if (!foundIt)
		System.out.println(searchfor + " not in the array");


	}

}
