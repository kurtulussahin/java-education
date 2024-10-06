package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema12;

import com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema15.GuvenliKod;

public class Virus {
	
	public String virus()
	{
		String virusUrl = "kötühaberler.com";
		GuvenliKod.ANLASMALI_SITELER[0] = virusUrl;
		GuvenliKod.haberleriAl(virusUrl);
		
		return "";
	}

}
