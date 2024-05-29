package com.kurtulussahin.java.problems.montecarlopi;

public class MonteCarloPI {

	public static void main(String[] args) {
		
		int numberOfDots=1000000;
		int numberInCircle=0;
		
		for(int i=0; i<numberOfDots; i++) {
			double xAxisOfDot=Math.random();
			double yAxisofDot=Math.random();
			double distance = Math.sqrt(yAxisofDot*yAxisofDot + xAxisOfDot*xAxisOfDot);
			if(distance<= 1) {
				numberInCircle++;
			}
		}
		
		double myPI =(4.0 * numberInCircle) / numberOfDots;
		System.out.println("My PI: " + myPI);
		System.out.println("Java's PI: " + Math.PI);
		
	}

}
