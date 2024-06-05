package com.kurtulussahin.java.collections.comperator;

public class ComperatorDogTest {

	public static void main(String[] args) {
		ComperatorDog Dog1 = new ComperatorDog("Shaggy", 30);
		ComperatorDog Dog2 = new ComperatorDog("Lacy", 2);
		
		System.out.println("Compara Dog1, Dog2");
		System.out.print(Dog1.compare(Dog1, Dog2) );

	}

}
