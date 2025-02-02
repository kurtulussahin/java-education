package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.item5;

public class TurkishDictionaryUtilitySingleton {
	
	private final static Dictionary turkishDict = new Dictionary("Turkish");
	public static TurkishDictionaryUtilitySingleton INSTANCE = new TurkishDictionaryUtilitySingleton();
	
	private TurkishDictionaryUtilitySingleton() {
		// TODO Auto-generated constructor stub
	}
	public static TurkishDictionaryUtilitySingleton getInstance(){
		return INSTANCE;
	}
	public String getSynonym(String text)
	{
		if(turkishDict.isValid(text)) {
			return "demo synonym";
		}
		return "";
	}

}
