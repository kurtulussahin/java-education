package com.kurtulussahin.java.problems.insertioninarray;

public class InsertionInArray {

	public static void main(String[] args) {
		
		int[] arr = { 1, 5, 7, 9, 10, 50, 2, 200, 15 };
		int index = 3;
		int num=20;
		
		int[] arrInserted = new int[arr.length+1];
		
		for(int i=0; i<arr.length+1; i++) {
			if(i<index) {
				arrInserted[i]=arr[i];
			}
			if(i==index) {
				arrInserted[i]=num;
			}
			if(i>index) {
				arrInserted[i]=arr[i-1];
				System.out.println(arr[i-1] + " ");
			}
		}
		
		for(int i=0; i<arrInserted.length; i++) {
			System.out.print(arrInserted[i] + " ");
		}
		
		

	}

}
