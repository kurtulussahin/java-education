package com.kurtulussahin.java.ibtechproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class CustomerDAO implements IDAO {
	SessionFactory factory;
	IModel customer;
	
	public CustomerDAO(IModel newCustomer) {
		factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Customer.class)
				.buildSessionFactory();
		this.customer=newCustomer;
	}
	
	@Override
	public void save() {
		Session session = factory.getCurrentSession();
		try {			
			session.beginTransaction();
			System.out.println("Saving the customer...");
			session.save(customer);
			session.getTransaction().commit();
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

	public Customer getCustomer(int id) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.get(Customer.class, id);
		}
	}

	public List<Customer> getAllCustomers() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.createQuery("from Customer", Customer.class).list();
		}
	}

	public void updateCustomer(Customer customer) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.update(customer);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public void deleteCustomer(int id) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			Customer customer = session.get(Customer.class, id);
			if (customer != null) {
				session.delete(customer);
				System.out.println("Customer is deleted");
			}
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	
}