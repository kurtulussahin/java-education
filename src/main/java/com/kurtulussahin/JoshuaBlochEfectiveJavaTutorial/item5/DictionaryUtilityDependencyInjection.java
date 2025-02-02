package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.item5;

public class DictionaryUtilityDependencyInjection {
	
	private final Dictionary dict;
	
	public DictionaryUtilityDependencyInjection(Dictionary dict) {
		// TODO Auto-generated constructor stub
		this.dict = dict;
	}

	public String getSynonym(String text)
	{
		if(dict.isValid(text)) {
			return "demo synonym";
		}
		return "";
	}



}
