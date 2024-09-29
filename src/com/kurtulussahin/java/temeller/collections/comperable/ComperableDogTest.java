package com.kurtulussahin.java.temeller.collections.comperable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComperableDogTest {

	public static void main(String[] args) {
		List<ComperableDog> DogList = new ArrayList<>();

		DogList.add(new ComperableDog("Shaggy", 3));
		DogList.add(new ComperableDog("Lacy", 2));
		DogList.add(new ComperableDog("Roger", 10));
		DogList.add(new ComperableDog("Tommy", 4));
		DogList.add(new ComperableDog("Tammy", 1));

		Collections.sort(DogList);  
		System.out.println("Sorted by name:");
		System.out.print(DogList);
		
		
		Collections.sort(DogList, Collections.reverseOrder());   // Sorts the array list
		System.out.println("\nReversed:");
		System.out.print(DogList);

	}

}
