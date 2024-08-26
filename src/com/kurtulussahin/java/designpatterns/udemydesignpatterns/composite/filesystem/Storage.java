package com.kurtulussahin.java.designpatterns.udemydesignpatterns.composite.filesystem;

public interface Storage {
	
	public void rename(String newName);
	
	public void save();
	
	public void delete();

	public Storage copy();

	public void move(Directory target);
}
