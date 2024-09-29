package com.kurtulussahin.java.problems.nexttolargest;

import static org.junit.Assert.assertEquals;

import org.junit.Test; 

public class NextToLargestTest { 
	
	@Test
	public void test01() { 
		assertEquals(40, NextToLargest.secondLargest(new int[] {10,40,30,20,50}));
	}

	@Test
	public void test02() { 
		assertEquals(105, NextToLargest.secondLargest(new int[] {25,143,89,13,105}));
	}

	@Test
	public void test03() { 
		assertEquals(23, NextToLargest.secondLargest(new int[] {54,23,11,17,10}));
	}

	@Test
	public void test04() { 
		assertEquals(417, NextToLargest.secondLargest(new int[] {513,211,131,417,11}));
	}

	@Test
	public void test05() { 
		assertEquals(65, NextToLargest.secondLargest(new int[] {63,44,11,22,33,66,65}));
	}

	@Test
	public void test06() { 
		assertEquals(-17, NextToLargest.secondLargest(new int[] {-24,-29,-92,-11,-17}));
	}

}
// end of tests
