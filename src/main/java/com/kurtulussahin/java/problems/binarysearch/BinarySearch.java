package com.kurtulussahin.java.problems.binarysearch;

public class BinarySearch {
	
	public static void main(String args[]) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int target = 40;
		
		int index = binarySearch(arr, target);
		System.out.println(index);
		
	}
	
	static int binarySearch(int[] sortedArray, int target) {
		int selected =-1;
		
		int first = 0;
		int last =sortedArray.length-1;
		
		while (first<=last) {
			int midpoint = (last+first)/2;
			if(sortedArray[midpoint]==target) {
				return midpoint;
			}else if (sortedArray[midpoint]<target) {
				first = midpoint+1;
			}else if (sortedArray[midpoint]>target) {
				last=midpoint-1;
			}
		}
		return selected;
	}
}
