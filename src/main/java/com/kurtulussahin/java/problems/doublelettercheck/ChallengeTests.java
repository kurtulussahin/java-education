package com.kurtulussahin.java.problems.doublelettercheck;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ChallengeTests {
	@Test 
	public void test1() {
		assertEquals(true, DoubleLettersCheck.doubleLetters("loop"));
	}
	
	@Test 
	public void test2() {
		assertEquals(true, DoubleLettersCheck.doubleLetters("meeting"));
	}
	
	@Test 
	public void test3() {
		assertEquals(true, DoubleLettersCheck.doubleLetters("yummy"));
	}
	
	@Test 
	public void test4() {
		assertEquals(true, DoubleLettersCheck.doubleLetters("moo"));
	}
	
	@Test 
	public void test5() {
		assertEquals(true, DoubleLettersCheck.doubleLetters("toodles"));
	}
	
	@Test 
	public void test6() {
		assertEquals(true, DoubleLettersCheck.doubleLetters("droop"));
	}
	
	@Test 
	public void test7() {
		assertEquals(true, DoubleLettersCheck.doubleLetters("loot"));
	}
	
	@Test 
	public void test8() {
		assertEquals(false, DoubleLettersCheck.doubleLetters("orange"));
	}
	
	@Test 
	public void test9() {
		assertEquals(false, DoubleLettersCheck.doubleLetters("munchkin"));
	}
	
	@Test 
	public void test10() {
		assertEquals(false, DoubleLettersCheck.doubleLetters("forestry"));
	}
	
	@Test 
	public void test11() {
		assertEquals(false, DoubleLettersCheck.doubleLetters("raindrops"));
	}
	
	@Test 
	public void test12() {
		assertEquals(false, DoubleLettersCheck.doubleLetters("gold"));
	}
	
	@Test 
	public void test13() {
		assertEquals(false, DoubleLettersCheck.doubleLetters("paradise"));
	}
	
	@Test 
	public void test14() {
		assertEquals(false, DoubleLettersCheck.doubleLetters("chicken"));
	}
}
