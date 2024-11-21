package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema18;

import java.util.HashSet;

public class KötüBirKalıtımÖrneği extends HashSet<Object>{
	
	
	public static void main(String[] args) {
		
		KötüBirKalıtımÖrneği kötüÖrnek = new KötüBirKalıtımÖrneği();
		
		kötüÖrnek.add("kötü");
		kötüÖrnek.forEach(System.out::println);
		
		
	}
	
}
