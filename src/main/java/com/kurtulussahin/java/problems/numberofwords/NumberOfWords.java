package com.kurtulussahin.java.problems.numberofwords;

public class NumberOfWords {
	 public static int countWords(String s) {
	      String[] words = s.split(" ");
	      return words.length;
	    }
}
