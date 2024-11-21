package com.kurtulussahin.java.problems.nameshuffle;

public class NameShuffle {
	public static String nameShuffle(String s) {
		String[] parts = s.split(" ");
		String part1 = parts[0];
		String part2 = parts[1];
		return part2 + " " + part1;
	}
}
