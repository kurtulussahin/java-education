package com.kurtulussahin.problems.nameshuffle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ChallengeTests {
  @Test
  public void test1() {
    assertEquals("Trump Donald", NameShuffle.nameShuffle("Donald Trump"));
  }
	
	@Test
  public void test2() {
    assertEquals("O'Donnel Rosie", NameShuffle.nameShuffle("Rosie O'Donnel"));
  }
	
	@Test
  public void test3() {
    assertEquals("Butts Seymour", NameShuffle.nameShuffle("Seymour Butts"));
  }
	
	@Test
  public void test4() {
    assertEquals("Greene Ebony", NameShuffle.nameShuffle("Ebony Greene"));
  }
	
	@Test
  public void test5() {
    assertEquals("Kennedy Ken", NameShuffle.nameShuffle("Ken Kennedy"));
  }
	
	@Test
  public void test6() {
    assertEquals("Gonzalez Allison", NameShuffle.nameShuffle("Allison Gonzalez"));
  }
	
	@Test
  public void test7() {
    assertEquals("Frazier Albert", NameShuffle.nameShuffle("Albert Frazier"));
  }
	
	@Test
  public void test8() {
    assertEquals("Hopkins Eloise", NameShuffle.nameShuffle("Eloise Hopkins"));
  }
	
	@Test
  public void test9() {
    assertEquals("Welch Donnie", NameShuffle.nameShuffle("Donnie Welch"));
  }
	
	@Test
  public void test10() {
    assertEquals("Thomas Vernon", NameShuffle.nameShuffle("Vernon Thomas"));
  }
}
