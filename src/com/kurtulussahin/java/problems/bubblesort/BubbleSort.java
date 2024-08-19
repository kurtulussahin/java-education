package com.kurtulussahin.java.problems.bubblesort;

public class BubbleSort {
	public static int[] sortNumsAscending(int[] nums) {
	       int temp;
	      for(int i=0; i<nums.length; i++){
	        for(int j=i+1; j<nums.length; j++){
	          if(nums[i] > nums[j]){
	            temp = nums[i];
	            nums[i] = nums[j];
	            nums[j] = temp;
	          } 
	        }
	      }
	       return nums;
	    }
}
