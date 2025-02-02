package com.kurtulussahin.problems.reversestring;

public class ReverseString {

	public static String reverse(String str) {
		String reversedString="";
		for(int i=0; i<str.length(); i++){
			reversedString=str.charAt(i)+reversedString;
		}
		return reversedString;
	}

}
