package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.item5;

public class Dictionary {
	
	private String language;
	
	public Dictionary(String dil) {
		// TODO Auto-generated constructor stub
		this.language = dil;
	}
	
	public  Boolean isValid(String text)
	{
		if(text!= null) {
			return true;
		}
		return false;
	}

}
