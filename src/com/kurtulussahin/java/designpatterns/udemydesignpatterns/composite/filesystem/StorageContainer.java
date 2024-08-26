
package com.kurtulussahin.java.designpatterns.udemydesignpatterns.composite.filesystem;

import java.util.List;

import com.kurtulussahin.java.designpatterns.udemydesignpatterns.composite.filesystem.iterator.*;

public interface StorageContainer {
	
	public void add(Storage element);
	
	public void delete(Storage element);
	
	public void list();
	
	public List<Storage> elements();
	
	public DirectoryIterator iterator();

}
