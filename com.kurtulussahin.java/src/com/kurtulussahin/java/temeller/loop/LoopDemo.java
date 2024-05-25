package com.kurtulussahin.java.temeller.loop;

public class LoopDemo {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("Sum: " + sum);

		System.out.println("\nMultiplication Table");

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.format("%4d", i * j);
			}
			System.out.println();
		}

		System.out.println("\nFiboniacci Numbers");

		int f0 = 1;
		int f1 = 1;
		int fibonacciNumber;

		System.out.format("%8d", f0);
		System.out.format("%8d", f1);
		for (int i = 3; i <= 30; i++) {
			fibonacciNumber = f0 + f1;
			System.out.format("%8d", fibonacciNumber);
			f0 = f1;
			f1 = fibonacciNumber;
			if (i % 10 == 0)
				System.out.println();
		}
		
		System.out.println("While : ");
		double r = Math.random();
        System.out.println("r: " + r);
        
        while(r < 0.8) {
            r = Math.random();
            System.out.println("in while: " + r);
        }
        
        System.out.println("After while");
    
		System.out.println("Do While : ");
        double k;
        do {	// First block
            k = Math.random();
            System.out.println("in do-while: " + r);
        }while(k < 0.8d);	// Then condition
	}

}
