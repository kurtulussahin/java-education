package com.kurtulussahin.problems.plusminus;

import java.util.ArrayList;
import java.util.List;

public class PlusMinusTest {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);
        
        PlusMinus.plusMinus(arr);
		

	}

}
