package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.itema12;

public class RequestTest {
	
	public static void main(String[] args) {

		Request as = new Request();
		as.setBody("Govde");
		as.setHeader("Kafa");

		System.out.println(as.toString());
	}
}
