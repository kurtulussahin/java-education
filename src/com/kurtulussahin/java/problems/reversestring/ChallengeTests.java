package com.kurtulussahin.java.problems.reversestring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ChallengeTests {
  @Test
  public void test1() {
    assertEquals("olleh", ReverseString.reverse("hello"));
  }
	
	@Test
  public void test2() {
    assertEquals("dlrow", ReverseString.reverse("world"));
  }
	
	@Test
  public void test3() {
    assertEquals("a", ReverseString.reverse("a"));
  }
	
	@Test
  public void test4() {
		System.out.println("An empty string should return an empty string.");
    assertEquals("", ReverseString.reverse(""));
  }
}
