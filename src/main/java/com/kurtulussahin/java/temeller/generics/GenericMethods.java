package com.kurtulussahin.java.temeller.generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bethan
 */
public class GenericMethods {

    static Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true};

    public static List arrayToList(Object[] array, List<Object> list) {
        for (Object object : array) {
            list.add(object);
        }
        return list;
    }

    public static<T> List<T> arrayToListGenericMethod(T[] array, List<T> list) {
        for (T object : array) {
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {

        List<String> intList = arrayToList(intArray, new ArrayList<>());
        //Runtime Error : class java.lang.Integer cannot be cast to class java.lang.String
        //System.out.println(intList.get(0));

        //Compile time Error : SAFE
        //List<String> intList2 = arrayToListGenericMethod(intArray, new ArrayList<>());
        //System.out.println(intList.get(0));
    }

}
