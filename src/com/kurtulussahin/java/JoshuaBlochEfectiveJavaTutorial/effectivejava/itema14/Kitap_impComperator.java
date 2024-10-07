package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema14;

import java.util.Comparator;

public class Kitap_impComperator implements Comparator<Kitap_impComperator>{

	private String isim;
	private int sayfa;

	public Kitap_impComperator(String isim, int sayfa) {
		// TODO Auto-generated constructor stub
		this.isim = isim;
		this.sayfa = sayfa;
	}

	public Kitap_impComperator() {

	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getSayfa() {
		return sayfa;
	}

	public void setSayfa(int sayfa) {
		this.sayfa = sayfa;
	}

	@Override
	public String toString() {
		return "Kitap [isim=" + isim + ", sayfa=" + sayfa + "]";
	}

	@Override
	public int compare(Kitap_impComperator o1, Kitap_impComperator o2) {
		return o1.getIsim().compareTo(o2.getIsim());
	}
}
