package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.item7;

public class GarbageCollection {
	@Override
	public void finalize()
	{
		System.out.println("***********************Çöpler temizlendi.***********");
	}
	public static void main(String[] args) {
		GarbageCollection ali = new GarbageCollection();
		GarbageCollection mehmet = new GarbageCollection();
		GarbageCollection sıla = new GarbageCollection();
		
		ali = null;
		
		sıla = mehmet;
		
		System.gc();


		
	}

}
