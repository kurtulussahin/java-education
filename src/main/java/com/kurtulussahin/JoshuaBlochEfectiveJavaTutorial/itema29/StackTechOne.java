package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.itema29;

import java.util.Arrays;
import java.util.EmptyStackException;

//Generic stack using E[] (Pages 130-3)
public class StackTechOne<E> {
	
	private E[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	// The elements array will contain only E instances from push(E).
	// This is     to ensensureure type safety, but the runtime
	// type of the array won't be E[]; it will always be Object[]!
	@SuppressWarnings("unchecked")
	public StackTechOne() {
		elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(E e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public E pop() {
		if (size == 0)
			throw new EmptyStackException();
		E result = elements[--size];
		elements[size] = null; // Eliminate obsolete reference
		return result;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}


	
}