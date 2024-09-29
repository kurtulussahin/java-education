package com.kurtulussahin.java.personalprojects.ibtechproject.task1.operation;

import com.kurtulussahin.java.personalprojects.ibtechproject.task1.bag.Bag;

public interface CrudOperations {
	
	Bag add(Bag bag);
	
	Bag update(Bag bag);
	
	Bag list();
	
	Bag delete(Bag bag);
	
	void deleteAll();

}
