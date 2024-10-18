package com.kurtulussahin.java.codekata.dataStructureImplementations.neetcodeDynamicArray;

public class DynamicIntArray {

    private int capacity;
    private int size;
    private int[] arr;

    // O(n) n=capacity
    public DynamicIntArray(int capacity) {
        this.capacity=capacity;
        this.arr = new int[capacity];
        this.size=0;
    }

    // O(1)
    public int get(int i) {
        return arr[i];
    }

    // O(1)
    public void set(int i, int n) {
        arr[i]=n;
    }

    // Worst: O(n) - Avg/Ammortized: O(1)
    public void pushback(int n) {
        if(size==capacity){
            resize();
        }
        arr[size]=n;
        size++;
    }

    // O(1)
    public int popback() {
        size--;
        return arr[size];
    }

    // O(n)
    private void resize() {
        capacity=capacity*2;
        int[] new_arr = new int[capacity];
        for(int i=0; i<size; i++){
            new_arr[i]=arr[i];
        }
        arr=new_arr;
    }

    // O(1)
    public int getSize() {
        return size;
    }

    // O(1)
    public int getCapacity() {
        return capacity;
    }
}


