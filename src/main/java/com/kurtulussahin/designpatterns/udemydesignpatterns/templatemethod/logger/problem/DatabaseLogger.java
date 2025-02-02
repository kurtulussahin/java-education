package com.kurtulussahin.designpatterns.udemydesignpatterns.templatemethod.logger.problem;

public class DatabaseLogger {
	public void log(String message) {
		String messageTolog = serializeObject(message);
		connecToDb();
		insertlogToDb(messageTolog);
		closeDbConnection();
	}

	private String serializeObject(Object message) {
		System.out.println("Serializing log object");
		return message.toString();
	}

	private void connecToDb() {
		System.out.println("Connecting to db");
	}

	private void insertlogToDb(String message) {
		System.out.println("Inserting logs to db = " + message);
	}

	private void closeDbConnection() {
		System.out.println("Closing db connection");
	}
}
