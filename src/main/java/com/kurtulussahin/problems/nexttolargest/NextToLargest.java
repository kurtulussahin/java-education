package com.kurtulussahin.problems.nexttolargest;

public class NextToLargest {
	public static int secondLargest(int[] num) {
		
		for(int i=0; i<num.length; i++){
			System.out.print(num[i]+" ");  
		}
		System.out.println(); 
		
		//boobleSort
		for(int i=0; i<num.length-1; i++){
			if(num[i]>num[i+1]){
				int tempNum=num[i];
				num[i]=num[i+1];
				num[i+1]=tempNum;
				i=-1;
			}
		}
		return num[num.length-2];
	}
}