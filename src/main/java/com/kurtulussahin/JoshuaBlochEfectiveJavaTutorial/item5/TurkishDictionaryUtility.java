package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.item5;

public class TurkishDictionaryUtility {
	
	private static final Dictionary turkishDict = new Dictionary("Turkish");
	
	private TurkishDictionaryUtility() {
		// TODO Auto-generated constructor stub
	}
	
	public static String getSynonym(String text)
	{
		if(turkishDict.isValid(text)) {
			return "demo synonym";
		}
		return "";
	}
	
	
}
