package com.kurtulussahin.java.personalprojects.ibtechproject.task1.operation;

import com.kurtulussahin.java.personalprojects.ibtechproject.task1.bag.Bag;
import com.kurtulussahin.java.personalprojects.ibtechproject.task1.dao.AddresDao;

public class AddresOperation implements CrudOperations {

	@Override
	public Bag add(Bag bag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bag update(Bag bag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bag list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bag delete(Bag bag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAll() {
		AddresDao.deleteAll();
	}
}
