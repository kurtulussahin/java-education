package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema29;

import java.util.concurrent.DelayQueue;

public class TestDrive {

	// Little program to exercise our generic Stack
	public static void main(String[] args) {

		StackTechOne<String> stack = new StackTechOne<>();
		String[] numbers =  {"1","2","3","4"};
		for (String number : numbers)
			stack.push(number);

		while (!stack.isEmpty())
			System.out.println(stack.pop().toUpperCase());

	}

}
