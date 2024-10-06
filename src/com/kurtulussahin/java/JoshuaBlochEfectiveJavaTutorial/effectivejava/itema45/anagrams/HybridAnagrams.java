package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema45.anagrams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

// Tasteful use of streams enhances clarity and conciseness (Page 205)
public class HybridAnagrams {
	
	public static void main(String[] args) throws IOException {
		
		Path dictionary = Paths.get("D:\\FS\\Learning\\E book\\effective-java\\src\\main\\java\\com\\effectivejava\\tutorial\\effectivejava\\itema45\\anagrams\\words");
		int minGroupSize = 1;

		try (Stream<String> words = Files.lines(dictionary)) 
		{
			words.collect(groupingBy(word -> alphabetize(word)))
					.values()
					.stream()
					.filter(group -> group.size() >= minGroupSize)
					.forEach(g -> System.out.println(g.size() + ": " + g));
		}
	}

	private static String alphabetize(String s)
	{
		char[] a = s.toCharArray();
		Arrays.sort(a);
		return new String(a);
	}
	
}