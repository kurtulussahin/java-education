package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.itema63;

public class concatenationPerformanceDemo {
	
	/*
	 * When two strings are concatenated, the contents of both are copied.
	 *	For example, consider this method, which constructs the string 
	 *	representation of a billing statement by repeatedly concatenating a line for each item
	 */
	
	public static String concatenation()
	{
		String result = "";
		String arr[] = {"Ali","Veli","Veli","Veli","Veli","Veli","Veli","Veli","Veli"};
		
		for (int i = 0; i < arr.length; i++)
		{
			result += arr[i];
		}
		return result;
	}

	public static String stringBuiler()
	{
		String arr[] = {"Ali","Veli","Veli","Veli","Veli","Veli","Veli","Veli","Veli"};
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < arr.length; i++)
		{
			b.append(arr[i]);
		}
		return b.toString();
	}

	public static void main(String[] args) {
		
		// Hatırlamakta fayda var stringler immutable objelerdir.
		
		long start = System.nanoTime();
		stringBuiler();
		long finish = System.nanoTime();
		long timeElapsed = finish - start;
		System.out.println(timeElapsed);
		System.out.println(stringBuiler());
		
		//sb();
		
		// concatenation -> 68580 nanoTime
		// sb -> 			39655 nanoTime
		
	}
	
	// Summary: Don’t use the string concatenation operator to combine more than a few strings unless performance is irrelevant.

}
