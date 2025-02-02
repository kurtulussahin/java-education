package com.kurtulussahin.designpatterns.udemydesignpatterns.templatemethod.logger.problem;

public class LoggerDemo {
	public static void main(String[] args) {

		DatabaseLogger databaseLogger = new DatabaseLogger();
		databaseLogger.log("Some Logs");

		FileLogger fileLogger = new FileLogger();
		fileLogger.log("Some Logs");

	}

}
