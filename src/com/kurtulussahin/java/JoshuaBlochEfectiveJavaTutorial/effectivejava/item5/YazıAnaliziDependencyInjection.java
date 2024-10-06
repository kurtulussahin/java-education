package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.item5;

public class YazıAnaliziDependencyInjection {
	
	private final Sözlük sözlük;
	
//	public YazıAnaliziDependencyInjection(Supplier<Sözlük> sözlük) {
//		// TODO Auto-generated constructor stub
//		this.sözlük =  sözlük.get();
//	}
	
	public YazıAnaliziDependencyInjection(Sözlük sözlük) {
		// TODO Auto-generated constructor stub
		this.sözlük = sözlük;
	}
	
	public boolean isValid()
	{
		return true;
	}
	
	public static String upuzunBayağıUzunBirMetodYazıyorumŞuAnda()
	{
		return "";
	}
	
}
