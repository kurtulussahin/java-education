package com.kurtulussahin.java.collections.set.equalsandhashcode;

import java.util.HashSet;
import java.util.Set;

public class EqualsAndHashCodeDemo {

	public static void main(String[] args) {
		Dog Dog1 = new Dog("Shaggy", 30);
		Dog Dog2 = new Dog("Lacy", 2);
		Dog Dog3 = new Dog("Lacy", 2);
		
		System.out.println(Dog1.equals(Dog2));
		System.out.println(Dog2.equals(Dog3));
		
		System.out.println(Dog1.hashCode());
		System.out.println(Dog2.hashCode());
		System.out.println(Dog3.hashCode());
		
		
	    Set<Dog> set = new HashSet<>();
	    set.add(Dog1);
	    set.add(Dog2);
	    set.add(Dog3); //same dog, not add
	    
	    System.out.println(set);


	}

}
