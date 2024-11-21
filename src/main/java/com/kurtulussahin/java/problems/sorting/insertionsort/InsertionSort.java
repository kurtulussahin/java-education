package com.kurtulussahin.java.problems.sorting.insertionsort;

public class InsertionSort {

    public static int[] insertionSort(int[] nums){

        for(int i=0; i<nums.length-1; i++) {
            for(int j=i; j>=0; j--) {
                if (nums[j + 1] < nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
}
