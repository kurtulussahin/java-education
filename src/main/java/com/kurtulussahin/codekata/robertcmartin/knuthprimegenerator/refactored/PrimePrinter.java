package com.kurtulussahin.codekata.robertcmartin.knuthprimegenerator.refactored;

public class PrimePrinter {
	private static final int numberOfPrimes = 1000;
	private static final int linesPerPage = 50;
	private static final int colums = 4;
	
	public static void main(String[] args) {
		PrimeGenerator primeGenerator = new PrimeGenerator();
		NumberPrinter numberPrinter = new NumberPrinter(linesPerPage, colums);
		
		int primes[] = primeGenerator.generatePrimes(numberOfPrimes);
		numberPrinter.print(primes,numberOfPrimes);
	}
}







