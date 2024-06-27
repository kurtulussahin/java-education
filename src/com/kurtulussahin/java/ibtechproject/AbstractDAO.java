package com.kurtulussahin.java.ibtechproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class AbstractDAO implements IDAO {
	IModel model;
	SessionFactory factory;
	
	protected AbstractDAO() {	
	}
	
	@Override
	public void save() {
		Session session = factory.getCurrentSession();
		try {			
			session.beginTransaction();
			System.out.println("Saving the..."+model);
			session.save(model);
			session.getTransaction().commit();
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}
}
