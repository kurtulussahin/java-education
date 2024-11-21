package com.kurtulussahin.java.temeller.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

  public static void main(String args[]) { 
      int count[] = {34, 22,10,60,30,22};
      Set<Integer> set = new HashSet<>();
         for(int i = 0; i < 6; i++) {
        	 System.out.println(set.add(count[i]));
         }
         System.out.println(set);
         
         // print HashSet elements one by one.
         // Insertion order in not preserved and it is based
         // on hash code of objects.
  
         // creates Iterator object.
         Iterator itr = set.iterator();
  
         // check element is present or not. if not loop will
         // break.
         while (itr.hasNext()) {
             System.out.println(itr.next());
         }
      
   }
} 