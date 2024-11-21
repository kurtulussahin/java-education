package com.kurtulussahin.java.temeller.collections.utilitycass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class CollectionsUtilityClass {

	public static void main(String[] args) {
		
//		Searching Collections
//
//		Among the most common operations on collections is searching their contents. Here the Collections Utility provides several options.
//		Binary Search
//
//		Collections provides options for executing a binary search on a sorted collection:

		List<String> nameList = List.of("Ana", "Billy", "Denys", "Heather", "Jim", "Nicolai");
		Collections.binarySearch(nameList, "Billy");//1
		System.out.println(Collections.binarySearch(nameList, "Billy"));
//		Min/Max
//
//		If all the items of a collection implement Comparable, Collections has min() and max() for finding the lowest values and max value of the collection based on natural ordering, respectively:

		Collections.max(nameList);//Nicolai
		Collections.min(nameList);// Ana

//		Frequency
//
//		Collections can search for the number of times an item exists in a collection with frequency:

		Collections.frequency(nameList, "Denys");//1



//		Fill
		List<String> advocates = new ArrayList<>(List.of("Ana", "Billy", "Denys", "Heather", "Jim", "Nicolai"));
		Collections.fill(advocates, "Billy");//Billy, Billy, Billy, Billy, Billy, Billy

//		Replace
//
//		If you need to replace specific values in a List, there is replaceAll(), which will replace all instances of the target value with the replacement value:

		Collections.replaceAll(advocates, "Billy", "Nicolai");//Nicolai, Nicolai, Nicolai, Nicolai, Nicolai, Nicolai

//		Reordering Collections
//
//		If you need to change the order of a Collection, the Collections Utility has many options.
//		Sort
//
//		To sort a collection in its natural ordering, there is: sort(Collection). All items in the collection must implement Comparable. Alternatively, sort(Collection, Comparable) can be used if the items don’t implement Comparable or a different ordering is desired. There is also the complementary reverseOrder() and Collections.reverseOrder(Comparable) which inverts the natural ordering. Finally there is also reverse(Collection):

		Collections.sort(advocates);//Ana, Billy, Denys, Heather, Jim, Nicolai
		Collections.sort(advocates, Collections.reverseOrder());//Nicolai, Jim, Heather, Denys, Billy, Ana
		Comparator<String> reverseString = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {return o2.compareTo(o1);}
		};
		Collections.sort(advocates, Collections.reverseOrder(reverseString));//Ana, Billy, Denys, Heather, Jim, Nicolai Collections.reverse(advocates);//Nicolai, Jim, Heather, Denys, Billy, Ana

//		Rotate
//
//		Collections can also rotate a List by index like in the example below:

		Collections.rotate(advocates, 3);//Heather, Jim, Nicolai, Ana, Billy, Denys

//		Swap
//
//		If the position of specific items needs to be changed, that can be done with swap():

		Collections.swap(advocates, 0, advocates.size() -1);//Nicolai, Billy, Denys, Heather, Jim, Ana
//
//		Shuffle
//
//		Collections can also be used to randomly reorder a List with shuffle():

		Collections.shuffle(advocates, new Random());// [non-stable order]

//		Converting Collections
//
//		Collections can also assist in converting collections from one type to another type.
//		Checked
//
//		A collection can be converted into a Checked version which provides additional guarantees beyond what is provided by the generics system that only items of the assigned type of a collection can be added:

		Collections.checkedList(advocates, String.class);

//		Enumeration
//
//		Collections can be converted in an Enumeration with enumeration():

		Collections.enumeration(advocates);
//
//		Unmodifiable
//
//		Collections provides unmodifiableX() methods for creating an unmodifiable view of the provided collection. If there are changes made to the provided collection, then they might show up in the view:

		Collections.unmodifiableList(advocates);

//		Synchronized
//
//		Collections can also provide a synchronized implementation of the associated collection type:

		Collections.synchronizedList(advocates);
//
//		Note: Using synchronized collection implementations isn’t a problem with virtual threads as they only guard in-memory actions, not I/O or other external calls, which are typically (much) lengthier.
//		Empty
//
//		Collections can also create an unmodifiable empty collection, which can be helpful if needed to fulfill a method argument requirement:

		Collections.emptyList();

	}

}
