package com.kurtulussahin.java.temeller.statickeyword;

public class StaticDemo {
	static int i = 10;
	int j = 10;
	
	public static void main(String args[]) {
		System.out.println("StaticDemo.i: " + i);
		System.out.println("StaticDemo.i: " + StaticDemo.i);
		
		StaticDemo.increment();

		System.out.println("StaticDemo.i: " + StaticDemo.i);

		StaticDemo st1 = new StaticDemo();
		StaticDemo st2 = new StaticDemo();

		// Unethical access :)
		System.out.println("st1.i: " + st1.i);
		System.out.println("st2.i: " + st2.i);
		
		StaticDemo.increment();

		// Unethical access :)
		st1.increment();
		st2.increment();

		System.out.println("st1.i: " + st1.i);
		System.out.println("st2.i: " + st2.i);
		System.out.println("StaticDemo.i: " + StaticDemo.i);
		System.out.println("StaticDemo.i: " + i);

	}

	 static void increment() {
		i++;
	}
}
