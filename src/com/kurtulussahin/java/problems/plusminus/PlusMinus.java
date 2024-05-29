package com.kurtulussahin.java.problems.plusminus;

import java.util.List;

public class PlusMinus {

	public static void plusMinus(List<Integer> arr) {
	     int positiveCount=0;
	        int negativeCount=0;
	        int zeroCount=0;
	        double sixZero=0.000000;
	        
	        for (Integer i : arr){
	            if (i==0){
	                zeroCount++;
	            }
	             else if (i<0){
	                negativeCount++;
	            }
	             else if (i>0){
	                positiveCount++;
	            }       
	        }
	         System.out.println((positiveCount+sixZero)/arr.size());
	         System.out.println((negativeCount+sixZero)/arr.size());
	         System.out.println((zeroCount+sixZero)/arr.size());
	    }
}
