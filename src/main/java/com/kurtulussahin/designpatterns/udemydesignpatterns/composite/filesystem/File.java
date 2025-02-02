package com.kurtulussahin.designpatterns.udemydesignpatterns.composite.filesystem;

public class File extends StorageElement{
	
	public File(String name, Storage parent) {
		super(name, parent);
	}
}
