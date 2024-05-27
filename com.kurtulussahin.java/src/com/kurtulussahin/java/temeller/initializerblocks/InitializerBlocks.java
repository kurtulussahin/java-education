package com.kurtulussahin.java.temeller.initializerblocks;

import java.util.Random;

public class InitializerBlocks {

	double d;
//	d = 3.14D; // Can't do this. Use initializers instead.

	{
		System.out.println("\nIn an instance initializer block-1.");
		d = calculateD();
	}

	static int i;

	static {
		System.out.println("In a static initializer block.");
		InitializerBlocks.i = 0;
	}

	static int[] ints = new int[10];

	static {
		System.out.println("\nInitializing the static array.");
		for (int i = 0; i < ints.length; i++)
			ints[i] = (i + 1) * 10;
	}

	double calculateD() {
		return Math.random() * 10;
	}

	public static void main(String[] args) {
		new InitializerBlocks();
		new InitializerBlocks();

	}
}
