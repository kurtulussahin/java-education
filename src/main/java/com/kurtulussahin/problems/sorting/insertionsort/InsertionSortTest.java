package com.kurtulussahin.problems.sorting.insertionsort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsertionSortTest {

    @Test
    void sortOneMemberArray(){
        int[] unsorted = {1};
        int[] sorted = InsertionSort.insertionSort(unsorted);
        assertArrayEquals(new int[]{1}, sorted);
    }

    @Test
    void sortTwoMembersArray(){
        int[] unsorted = {2,1};
        int[] sorted = InsertionSort.insertionSort(unsorted);
        assertArrayEquals(new int[]{1,2}, sorted);
    }

    @Test
    void sortThreeMembersArray(){
        int[] unsorted = {2,3,1};
        int[] sorted = InsertionSort.insertionSort(unsorted);
        assertArrayEquals(new int[]{1,2,3}, sorted);
    }

    @Test
    void sortAnArray(){
        int[] unsorted = {2,3,1,5,7,4,9,0,100,2};
        int[] sorted = InsertionSort.insertionSort(unsorted);
        assertArrayEquals(new int[]{0,1,2,2,3,4,5,7,9,100}, sorted);
    }
}
