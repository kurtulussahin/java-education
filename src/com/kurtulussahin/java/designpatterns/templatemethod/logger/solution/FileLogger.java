package com.kurtulussahin.java.designpatterns.templatemethod.logger.solution;

public class FileLogger extends LoggerTemplate{
	
	@Override
	public void openDataSource() {
		System.out.println("Opening file");
	}
	@Override
	public void insertLog(String message) {
		System.out.println("Inserting logs to file = " + message);
	}
	@Override
	public void closeDataSource() {
		System.out.println("Closing file");
	}
}
