package com.kurtulussahin.java.rcmartinstackkata;

public class Stack {



	private int size;
	private int capacity;
	private int elements[];
	
	public static Stack Make(int capacity) {
		return new Stack(capacity);
	}
	
	private Stack(int capacity) {
		this.capacity=capacity;
		elements=new int[capacity];
	}

	public boolean isEmpty() {
		return size==0;
	}

	public int getSize() {
		return size;
	}

	public void push(int element) {
		if(size==capacity) {
			throw new Overflow();
		}
		this.elements[size]=element;
		size++;
	}

	public int pop() {
		if(size==0) {
			throw new Underflow();
		}
		--size;
		return elements[size];
	}
	
	public class Overflow extends RuntimeException {

	}
	

	public class Underflow extends RuntimeException {

	}

}
