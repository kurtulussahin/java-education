package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema14;

import java.util.ArrayList;
import java.util.Collections;

public class ComparisonTest {
	
	public static void main(String[] args) {

		ArrayList<Kitap_impComperable> kitapListesi = new ArrayList<Kitap_impComperable>();
		
		kitapListesi.add(new Kitap_impComperable("Şibumi", 500));
		kitapListesi.add(new Kitap_impComperable("Otomatik Portakal", 200));
		kitapListesi.add(new Kitap_impComperable("Ab", 200));
		
		Collections.sort(kitapListesi);
		
		System.out.println("Sıralama1");
		for (Kitap_impComperable kitap : kitapListesi) {
			System.out.println(kitap.toString());
		}
		
		
			
	}

}
