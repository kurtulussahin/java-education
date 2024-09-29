package com.kurtulussahin.java.temeller.oopconcepts.interfacedemo.factory;

public class Boss implements Worker{
	
	public void youWorkToo(){
		System.out.println("Boss is working for you :)");
	}

	@Override
	public void work() {
		youWorkToo();
	}
}
