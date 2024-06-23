
package com.kurtulussahin.java.designpatterns.composite.filesystem.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.kurtulussahin.java.designpatterns.composite.filesystem.*;

public class DirectoryIterator implements StorageIterator {
	private Directory dir;
	private List<Storage> elements;
	private Iterator<Storage> iterator;
	
	public DirectoryIterator(Directory dir){
		this.dir = dir;
		elements = dir.elements();
		iterator = elements.iterator();
	}

	@Override
	public boolean hasNext() {
		return iterator.hasNext();
	}

	@Override
	public Storage next() {
		return iterator.next();
	}
}
