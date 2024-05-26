package com.kurtulussahin.java.temeller.array;

public class MultiDimArray {

	public static void main(String[] args) {
		
		String[][] multiDimArray = new String[2][];
		multiDimArray[0] = new String[3];
		multiDimArray[1] = new String[5];

		for (int i = 0; i < multiDimArray.length; i++) {
			for (int j = 0; j < multiDimArray[i].length; j++) {
				multiDimArray[i][j] = ""+i+","+j;
			}
		}
		
		for (int i = 0; i < multiDimArray.length; i++) {
			for (int j = 0; j < multiDimArray[i].length; j++) {
				System.out.println(multiDimArray[i][j]);
			}
		}
	

	}

}
