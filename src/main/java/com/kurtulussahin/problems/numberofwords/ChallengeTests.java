package com.kurtulussahin.problems.numberofwords;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ChallengeTests {
	@Test
	public void test1() {
		assertEquals(3, NumberOfWords.countWords("It's high noon"));
	}

	@Test
	public void test2() {
		assertEquals(4, NumberOfWords.countWords("Is this easy mode"));
	}

	@Test
	public void test3() {
		assertEquals(5, NumberOfWords.countWords("What an easy task, right"));
	}

	@Test
	public void test4() {
		assertEquals(4, NumberOfWords.countWords("This is a test"));
	}

	@Test
	public void test5() {
		assertEquals(6, NumberOfWords.countWords("Just an example here move along"));
	}

	@Test
	public void test6() {
		assertEquals(4, NumberOfWords.countWords("How are you today?"));
	}
}
