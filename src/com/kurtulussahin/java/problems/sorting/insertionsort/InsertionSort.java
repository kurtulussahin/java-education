package com.kurtulussahin.java.problems.sorting.insertionsort;

public class InsertionSort {

    public static int[] insertionSort(int[] nums){

        if(nums[1]<nums[0]){
            int temp=nums[0];
            nums[0]=nums[1];
            nums[1]=temp;
        }

        return nums;
    }
}
