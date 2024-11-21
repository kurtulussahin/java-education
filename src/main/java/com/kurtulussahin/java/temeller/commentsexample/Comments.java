package com.kurtulussahin.java.temeller.commentsexample;
/**
 * @author <a href="mailto:kurtulussahin@gmail.com">Kurtuluş Şahin</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.kurtulussahin.com">http://www.kurtulussahin.com</a>
 *      </p>
 *      That's a <b>Javadoc</b> comment!
 *                                    
 */
public class Comments {

	private String name = "Comments"; // That's just a String.

	/**
	 * This method calculates the double of passed parameter and returns it.
	 * 
	 * @param x		The value to be doubled.
	 * @return 		Double of the value of x passed as parameter.
	 */
	public int doubleIt(int x) {

		/*
		 * That's a comment block!
		 */
		return 2 * x; // Just multiply x by 2!
	}
}

