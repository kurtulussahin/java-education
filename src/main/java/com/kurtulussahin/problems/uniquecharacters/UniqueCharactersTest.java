package com.kurtulussahin.problems.uniquecharacters;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharactersTest {

	public static void main(String[] args) {

		Boolean isUnique = isUnique("abcde");
		System.out.println(isUnique);

	}

	public static boolean isUnique(String str) {
		Map<Character, Boolean> chars = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			if (!chars.containsKey(str.charAt(i))) {
				chars.put(str.charAt(i), true);
			} else {
				return false;
			}
		}

		return true;
	}
}
