package com.kurtulussahin.problems.sorting.mergesort;

public class MergeSort {
    public static int[] mergeSort(int[] nums, int l, int r) {

        if (l < r) {

            // Find the middle point of arr
            int m = (l + r) / 2;

            mergeSort(nums, l, m);   // sort left half
            mergeSort(nums, m + 1, r); // sort right half
            merge(nums, l, m, r);    // merge sorted halfs
        }
        return nums;
    }

    private static void merge(int[] nums, int l, int m, int r) {
        // Find lengths of two subarrays to be merged
        int length1 = m - l + 1;
        int length2 = r - m;

        // Create temp arrays
        int L[] = new int[length1];
        int R[] = new int[length2];

        // Copy the sorted left & right halfs to temp arrays
        for (int i = 0; i < length1; i++) {
            L[i] = nums[l + i];
        }

        for (int j = 0; j < length2; j++) {
            R[j] = nums[m + 1 + j];
        }

        // initial indexes of left and right sub-arrays
        int i = 0; // index for left
        int j = 0; // index for right
        int k = l; // Initial index of merged subarray array

        // Merge the two sorted halfs into the original array
        while (i < length1 && j < length2) {
            if (L[i] <= R[j]) {
                nums[k] = L[i];
                i++;
            } else {
                nums[k] = R[j];
                j++;
            }
            k++;
        }
        // One of the halfs will have elements remaining

        // Copy remaining elements of L[] if any
        while (i < length1) {
            nums[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < length2) {
            nums[k] = R[j];
            j++;
            k++;
        }
    }

}
