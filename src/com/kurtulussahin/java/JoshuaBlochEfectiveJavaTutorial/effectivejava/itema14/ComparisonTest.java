package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema14;

import java.util.ArrayList;
import java.util.Collections;

public class ComparisonTest {
	
	public static void main(String[] args) {

		ArrayList<Kitap_impComperable> kitapListesi1 = new ArrayList<Kitap_impComperable>();
		
		kitapListesi1.add(new Kitap_impComperable("Şibumi", 500));
		kitapListesi1.add(new Kitap_impComperable("Otomatik Portakal", 200));
		kitapListesi1.add(new Kitap_impComperable("Ab", 300));
		
		Collections.sort(kitapListesi1);
		
		System.out.println("Sıralama1");
		for (Kitap_impComperable kitap : kitapListesi1) {
			System.out.println(kitap.toString());
		}

		ArrayList<Kitap_impComperator> kitapListesi2 = new ArrayList<Kitap_impComperator>();

		Kitap_impComperator kitap1 = new Kitap_impComperator("Şibumi", 500);
		Kitap_impComperator kitap2 = new Kitap_impComperator("Otomatik Portakal", 200);
		System.out.println(kitap1.compare(kitap1,kitap2));
			
	}

}
