package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema14;

public class Kitap_impComperable implements Comparable<Kitap_impComperable>{

	private String isim;
	private int sayfa;
	
	public Kitap_impComperable(String isim, int sayfa) {
		// TODO Auto-generated constructor stub
		this.isim = isim;
		this.sayfa = sayfa;
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
	public int compareTo(Kitap_impComperable o) {
		//Compares this object with the specified object for order.
		//Returns a negative integer, zero, or a positive integer
		// as this object is less than, equal to, or greater than the specified object.

		return this.sayfa - o.sayfa;
	}

	@Override
	public String toString() {
		return "Kitap [isim=" + isim + ", sayfa=" + sayfa + "]";
	}
	
}
