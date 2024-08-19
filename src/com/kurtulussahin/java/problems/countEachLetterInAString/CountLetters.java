package com.kurtulussahin.java.problems.countEachLetterInAString;

import java.util.HashMap;

public class CountLetters {

	public static void main(String[] args) {
		String str = "Java Program to Count the Occurrences of Each Character ";
		str=str.toLowerCase();
		HashMap<Character, Integer> charCount = new HashMap<>();
		for (int i = str.length() - 1; i >= 0; i--) {
			if (charCount.containsKey(str.charAt(i))) {
				int count = charCount.get(str.charAt(i));
				charCount.put(str.charAt(i), ++count);
			} else {
				charCount.put(str.charAt(i), 1);
			}
		}
		System.out.println(charCount);

	}

}
