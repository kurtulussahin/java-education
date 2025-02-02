package com.kurtulussahin.designpatterns.udemydesignpatterns.templatemethod.logger.problem;

public class FileLogger {
	public void log(Object object) {
		String messageTolog = serializeObject(object);
		openFile();
		writeLogToFile(messageTolog);
		closeFile();
	}

	private String serializeObject(Object object) {
		System.out.println("Serializing log object");
		return object.toString();
	}

	private void openFile() {
		System.out.println("Opening file");
	}

	private void writeLogToFile(String message) {
		System.out.println("Writing logs to file = " + message);
	}

	private void closeFile() {
		System.out.println("Closing file");
	}
}
