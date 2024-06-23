package com.kurtulussahin.java.designpatterns.templatemethod.logger.solution;

public abstract class LoggerTemplate {
	public String serializeObject(Object log) {
		System.out.println("Serializing log object");
		return log.toString();
	}
	public final void log(Object log) {
		String logText = serializeObject(log);
		openDataSource();
		insertLog(logText);
		closeDataSource();
	}
	public abstract void openDataSource();
	public abstract void closeDataSource();
	public abstract void insertLog(String log);
}
