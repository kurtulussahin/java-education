package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.item1;

public class Fenerbahce {
	
	private String name;
	private int age;
	
	public Fenerbahce(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}
	
	public Fenerbahce(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	
	public static Fenerbahce yeniFutbolcuUret(String yeniFutbolcu)
	{
		return new Fenerbahce(yeniFutbolcu, 22);
	}


    public int getAge() {
        return age;
    }
}
