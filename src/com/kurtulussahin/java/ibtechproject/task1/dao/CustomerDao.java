package com.kurtulussahin.java.ibtechproject.task1.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.kurtulussahin.java.ibtechproject.task1.model.Account;
import com.kurtulussahin.java.ibtechproject.task1.model.Addres;
import com.kurtulussahin.java.ibtechproject.task1.model.Customer;
import com.kurtulussahin.java.ibtechproject.task1.model.Phone;
import com.kurtulussahin.java.ibtechproject.task1.util.HibernateUtil;

public class CustomerDao {
	public Customer create(Customer customer) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.save(customer);
			transaction.commit();
			System.out.println("-> Creation successful. Customer Id: " + customer.getId());
			return customer;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
			return null;
		}
	}

	public List<Customer> getCustomers() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			List<Customer> customers =session.createQuery("from Customer", Customer.class).list(); 
			System.out.println("-> Customers received.");
			return customers;
		}
	}
	
	public void listCustomers() {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			try {
				transaction = session.beginTransaction();
				List customers = session.createQuery("FROM Customer").list();
				for (Iterator iterator = customers.iterator(); iterator.hasNext();) {
					Customer customer = (Customer) iterator.next();
					System.out.print("--> Id: " + customer.getId());
					System.out.print(" Name: " + customer.getName());
					System.out.println(" Surname: " + customer.getSurname());
				}
				transaction.commit();
			} catch (HibernateException e) {
				if (transaction != null)
					transaction.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	   
	public Customer update(long customerId, String name, String surname) {

		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			try {
				transaction = session.beginTransaction();
				Customer customer = (Customer) session.get(Customer.class, customerId);
				customer.setName(name);
				customer.setSurname(surname);
				session.update(customer);
				transaction.commit();
				System.out.println("-> Update successful. Customer Id: " + customerId);
				return customer;
			} catch (HibernateException e) {
				if (transaction != null)
					transaction.rollback();
				e.printStackTrace();
				return null;
			} finally {
				session.close();
			}
		}
	}
	   
	public void delete(long customerId) {

		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			try {
				transaction = session.beginTransaction();
				Customer customer = (Customer) session.get(Customer.class, customerId);
				session.delete(customer);
				transaction.commit();
				System.out.println("-> Deletion successful. Customer Id: " + customerId);
			} catch (HibernateException e) {
				if (transaction != null)
					transaction.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	public static void deleteAll() {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			try {
				transaction = session.beginTransaction();
				String stringQuery = "DELETE FROM Customer";
				Query query = session.createQuery(stringQuery);
				query.executeUpdate();
				transaction.commit();
				System.out.println("-> Deletion successful");
			} catch (HibernateException e) {
				if (transaction != null)
					transaction.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}

