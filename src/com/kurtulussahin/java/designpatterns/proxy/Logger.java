package com.kurtulussahin.java.designpatterns.proxy;

import java.util.Date;

public class Logger {
	public static void log(String message){
		System.out.println("\n" + new Date() + ": " + message);
	}
}
