package com.kurtulussahin.java.problems.bubblesort;

public class bubbleSortV2 {

	public static void main(String[] args) {
		Integer[] arr = { 1, 5, 7, 9, 10, 50, 2, 200, 15 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < (arr.length - i); j++) {
				if (arr[j - 1] > arr[j]) {

					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
