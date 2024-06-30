package com.kurtulussahin.java.ibtechproject.task1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "command")
public class Command {
	
	@Id
	@Column(name = "command_name")
	private String commandName;

	@Column(name = "command_description")
	private String commandDescription;

	@Column(name = "class_name")
	private String className;

	@Column(name = "method_name")
	private String methodName;

	public Command() {
	}

	public Command(String commandName, String commandDescription, String className, String methodName) {
		this.commandName = commandName;
		this.commandDescription = commandDescription;
		this.className = className;
		this.methodName = methodName;
	}

	public String getCommandName() {
		return commandName;
	}

	public void setCommandName(String commandName) {
		this.commandName = commandName;
	}

	public String getCommandDescription() {
		return commandDescription;
	}

	public void setCommandDescription(String commandDescription) {
		this.commandDescription = commandDescription;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	@Override
	public String toString() {
		return "Command [commandName=" + commandName + ", commandDescription=" + commandDescription + ", className="
				+ className + ", methodName=" + methodName + "]";
	}
	
	
}
