package com.kurtulussahin.java.designpatterns.udemydesignpatterns.templatemethod.logger.solution;

public class DatabaseLogger extends LoggerTemplate {
	
	@Override
	public void openDataSource() {
		System.out.println("Connecting to db");
	}
	@Override
	public void insertLog(String message) {
		System.out.println("Inserting logs to db = " + message);
	}
	@Override
	public void closeDataSource() {
		System.out.println("Closing db connection");
	}
}
