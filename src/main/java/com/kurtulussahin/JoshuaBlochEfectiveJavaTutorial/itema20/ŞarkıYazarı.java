package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.itema20;

public interface ŞarkıYazarı {
	
	public void şarkıYaz();
	
	default boolean şiirYazabiliyormusun()
	{
		
		return true;
	}

}
