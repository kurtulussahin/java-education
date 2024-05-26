package com.kurtulussahin.java.temeller.array.stack;

import java.util.Arrays;

public class Stack {
	
	public static final int MAX_STACK_SIZE=5;
	boolean full=false;
	boolean empty=true;
	
	String[] stackArray = new String[MAX_STACK_SIZE];
	int emptyCellPointerOfStackArray = 0;
	
	// Put element on the top
	public boolean push(String newElement) {
		if(!full) {
			stackArray[emptyCellPointerOfStackArray]=newElement;
			emptyCellPointerOfStackArray++;
			empty=false;
			if(emptyCellPointerOfStackArray==MAX_STACK_SIZE) {
				full=true;
			}
			return true;
		}else {
			return false;
		}
		
	}
	
	// Pop element from the top
	public String pop() {
		String lastItem=null; 
		if(!empty) {
			lastItem=stackArray[emptyCellPointerOfStackArray-1];
			stackArray[emptyCellPointerOfStackArray-1]=null;
			emptyCellPointerOfStackArray--;
			if(emptyCellPointerOfStackArray!=MAX_STACK_SIZE) {
				full=false;
			}
			if(emptyCellPointerOfStackArray==0) {
				empty=true;
			}
		}
		return lastItem;
	} 

	// Remove all elements from stack
	public void clear() {
		Arrays.fill(stackArray, null);
		emptyCellPointerOfStackArray=0;
		empty=true;
		full=false;
	} 

	// Stack status operations
	// Is stack empty?
	public boolean isEmpty() {
		
		return empty;
	} 

	 // Is stack full?
	public boolean isFull() {
		
		return full;
	} 

	// How many elements in stack?
	public int size() {
		
		return emptyCellPointerOfStackArray;
	}
	
	// Capacity of stack?
	public int getCapacity() {
		
		return MAX_STACK_SIZE;
	}
	
	// Outputs the elements in the stack
	public void showElements() {
		System.out.println("*** Elements in Stack: ***");
		if(!empty) {
			for(String elementInStack: stackArray) {
				if(elementInStack!=null) {
					System.out.println(elementInStack);
				}
			}
		}
	}
}
