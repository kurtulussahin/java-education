package com.kurtulussahin.java.problems.sorting.bubblesort;

public class BubbleSortTest {
	public static void main(String[] args) {
		int[] sortedNumbers = BubbleSort.sortNumsAscending(new int[]{-51, -73, 65, 69, -76, 74, -14});
		
		for(int i=0; i<sortedNumbers.length; i++) {
			System.out.print(sortedNumbers[i]+" ");
		}
		
	}
}
