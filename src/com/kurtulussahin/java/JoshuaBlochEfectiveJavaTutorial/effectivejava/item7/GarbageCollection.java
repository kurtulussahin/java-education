package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.item7;

import java.util.ArrayList;
import java.util.List;

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
