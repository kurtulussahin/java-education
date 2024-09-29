package com.kurtulussahin.java.temeller.collections.list;

import java.util.ArrayList;

public class ArrayListDemo {

   public static void main(String args[]) {
      ArrayList al = new ArrayList();

      al.add("C");
      al.add("A");
      al.add("E");
      al.add("B");
      al.add("D");
      al.add("F");
 
      System.out.println("Size of al after additions: " + al.size());

      // display the array list
      System.out.println("Contents of al: " + al);

      // Remove elements from the array list
      al.remove("F");
      al.remove(2);
      System.out.println("Size of al after deletions: " + al.size());
      System.out.println("Contents of al: " + al);
      
      al.sort(null);
      System.out.println(al);
      
      al.contains("C");
      al.indexOf("C");
      al.lastIndexOf("C");
      al.get(0);
      al.clear();
      System.out.println("Contents of al: " + al);


   }
}

