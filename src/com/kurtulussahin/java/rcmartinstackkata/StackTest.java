package com.kurtulussahin.java.rcmartinstackkata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {
	private Stack stack;
	
	@Before
	public void setUp() throws Exception {
		stack = Stack.Make(2);
	}

	@Test
	public void newlyCreateStack_ShouldBeEmpty() throws Exception {
		assertTrue(stack.isEmpty());
		assertEquals(0,stack.getSize());
	}
	
	@Test
	public void afterOnePush_StackSizeShouldBeOne() throws Exception {
		stack.push(1);
		assertEquals(1,stack.getSize());
		assertFalse(stack.isEmpty());
	}
	
	@Test
	public void afterOnePushAndOnePop_ShouldBeEmpty() throws Exception {
		stack.push(1);
		stack.pop();
		assertTrue(stack.isEmpty());
	}
	
	@Test(expected = Stack.Overflow.class)
	public void whenPushedPastLimit_StackOverFlows() throws Exception {
		stack.push(1);
		stack.push(1);
		stack.push(1);
	}
	
	@Test(expected = Stack.Underflow.class)
	public void whenEmptyStackIsPopped_ShouldThrowUnderFlow() throws Exception {
		stack.pop();
	}
	
	@Test
	public void whenOneIsPushed_OneIsPopped() throws Exception{
		stack.push(1);
		assertEquals(1,stack.pop());
	}
	
	@Test
	public void whenOneAndTwoArePushed_TwoAndOneArePopped() throws Exception{
		stack.push(1);
		stack.push(2);
		assertEquals(2,stack.pop());
		assertEquals(1,stack.pop());
	}
	
	

}
