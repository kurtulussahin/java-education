package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema20;

public interface ŞarkıYazarı {
	
	public void şarkıYaz();
	
	default boolean şiirYazabiliyormusun()
	{
		
		return true;
	}

}
