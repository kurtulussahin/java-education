package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema13;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack implements Cloneable{
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public String stackName;
	
	public String getStackName() {
		return stackName;
	}


	public void setStackName(String stackName) {
		this.stackName = stackName;
	}


	public Stack() {
		this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}


	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public Object pop() {
		if (size == 0)
			throw new EmptyStackException();
		Object result = elements[--size];
		elements[size] = null; // Eliminate obsolete reference
		return result;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	// Ensure space for at least one more element.
	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}
	
	

	public Stack deeperClone() {
		try {
			Stack result = (Stack) this.clone();
			result.elements = elements.clone();
			return result;
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}
	

	// To see that clone works, call with several command line arguments
	public static void main(String[] args) throws CloneNotSupportedException {

		shallowCopyChangeReferanceValue();
		System.out.println();
		shallowCopyChangeObjectOfReferance();
		System.out.println();
		deeperCloneChangeOneLevelObjectOfReferance();
	}

	private static void shallowCopyChangeReferanceValue() throws CloneNotSupportedException {
		Stack stack = new Stack();

		String[] numaralar = {"1", "2", "3", "4"};
		for (String arg : numaralar)
			stack.push(arg);

		Stack copy = (Stack) stack.clone();
		String[] harfler = {"X", "Y", "Z", "Q"};
		stack.elements=harfler;

		while (!stack.isEmpty())
			System.out.print(stack.pop() + " ");

		System.out.println();

		while (!copy.isEmpty())
			System.out.print(copy.pop() + " ");
	}


	private static void shallowCopyChangeObjectOfReferance() throws CloneNotSupportedException {
		Stack stack = new Stack();

		String[] numaralar = {"1", "2", "3", "4"};
		for (String arg : numaralar)
			stack.push(arg);

		Stack copy = (Stack) stack.clone();

		while (!stack.isEmpty())
			System.out.print(stack.pop() + " ");

		System.out.println();

		while (!copy.isEmpty())
			System.out.print(copy.pop() + " ");
	}

	private static void deeperCloneChangeOneLevelObjectOfReferance() throws CloneNotSupportedException {
		Stack stack = new Stack();

		String[] numaralar = {"1", "2", "3", "4"};
		for (String arg : numaralar)
			stack.push(arg);

		Stack copy = (Stack) stack.deeperClone();

		while (!stack.isEmpty())
			System.out.print(stack.pop() + " ");

		System.out.println();

		while (!copy.isEmpty())
			System.out.print(copy.pop() + " ");
	}
}