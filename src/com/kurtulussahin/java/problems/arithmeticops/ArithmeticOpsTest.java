package com.kurtulussahin.java.problems.arithmeticops;

import static org.junit.Assert.assertEquals; 
import org.junit.Test; 

public class ArithmeticOpsTest {
	@Test
	public void test01() { 
		assertEquals(2, ArithmeticOps.operate(1, 1, "+"));
	}

	@Test
	public void test02() { 
		assertEquals(0, ArithmeticOps.operate(1, 1, "-"));
	}

	@Test
	public void test03() { 
		assertEquals(1, ArithmeticOps.operate(1, 1, "*"));
	}

	@Test
	public void test04() { 
		assertEquals(1, ArithmeticOps.operate(1, 1, "/"));
	}

	@Test
	public void test05() { 
		assertEquals(0, ArithmeticOps.operate(1, 1, "%"));
	}

	@Test
	public void test06() { 
		assertEquals(3, ArithmeticOps.operate(2, 1, "+"));
	}

	@Test
	public void test07() { 
		assertEquals(1, ArithmeticOps.operate(2, 1, "-"));
	}

	@Test
	public void test08() { 
		assertEquals(2, ArithmeticOps.operate(2, 1, "*"));
	}

	@Test
	public void test09() { 
		assertEquals(2, ArithmeticOps.operate(2, 1, "/"));
	}

	@Test
	public void test10() { 
		assertEquals(0, ArithmeticOps.operate(2, 1, "%"));
	}

	@Test
	public void test11() { 
		assertEquals(2468, ArithmeticOps.operate(1234,-1234, "-"));
	}
}
