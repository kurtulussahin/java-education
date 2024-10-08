package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema26;

import java.util.*;

//Fails at runtime - unsafeAdd method uses a raw type (List)!  (Page 119)
public class Raw {

    static void unsafeAdd(List list, Object o) {
        list.add(o);
    }

}