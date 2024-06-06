package com.kurtulussahin.java.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
	      HashMap<String, Integer> hm = new HashMap<String, Integer>();
	      
	      hm.put("Zara", 10);
	      hm.put("Mahnaz", 20);
	      hm.put("Ayan", 30);
	      hm.put("Daisy", 40);
	      hm.put("Qadir", 50);
	      
	      System.out.println(hm.put("Qadir", 50)); // keys should be unique

	      
	      Set set = hm.entrySet();
	      
	      Iterator i = set.iterator();
	      
	      // Display elements by keyvalue pair
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
	      System.out.println();
	      
	      int balance =  (int) hm.get("Zara");
	      hm.put("Zara", balance + 1000);
	      System.out.println("Zara's new balance: " + hm.get("Zara"));

	   // Display elements by key
	      Set keySet = hm.keySet();
			Iterator iterator = keySet.iterator();
			while (iterator.hasNext()) {
				String isim = (String) iterator.next();
				System.out.println(isim + ": " + hm.get(isim));
			}
	}

}
