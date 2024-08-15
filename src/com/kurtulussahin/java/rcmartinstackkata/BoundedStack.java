package com.kurtulussahin.java.rcmartinstackkata;

public class BoundedStack implements Stack {

	private int size;
	private int capacity;
	private int elements[];

	public static Stack Make(int capacity) {
		if (capacity < 0) {
			throw new IllegalCapacity();
		}
		if (capacity == 0) {
			return new ZeroCapacityStack();
		}
		return new BoundedStack(capacity);
	}

	private BoundedStack(int capacity) {
		this.capacity = capacity;
		elements = new int[capacity];
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void push(int element) {
		if (size == capacity) {
			throw new Overflow();
		}
		this.elements[size] = element;
		size++;
	}

	@Override
	public int pop() {
		if (isEmpty()) {
			throw new Underflow();
		}
		--size;
		return elements[size];
	}

	@Override
	public int top() {
		if (isEmpty()) {
			throw new Empty();
		}
		return elements[size - 1];
	}
	
	@Override
	public Integer find(int element) {
		for(int i=size-1; i>=0; i--) {
			if(elements[i]==element) {
				return (size-1)-i;
			}
		}
		return null;
	}

	private static class ZeroCapacityStack implements Stack {

		@Override
		public boolean isEmpty() {
			return true;
		}

		@Override
		public int getSize() {
			return 0;
		}

		@Override
		public void push(int element) {
			throw new Overflow();
		}

		@Override
		public int pop() {
			throw new Underflow();
		}

		@Override
		public int top() {
			throw new Empty();
		}

		@Override
		public Integer find(int element) {
			return null;
		}
	}

}
