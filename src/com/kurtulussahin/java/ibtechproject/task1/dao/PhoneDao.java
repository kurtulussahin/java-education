package com.kurtulussahin.java.ibtechproject.task1.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.kurtulussahin.java.ibtechproject.task1.model.Phone;
import com.kurtulussahin.java.ibtechproject.task1.util.HibernateUtil;

public class PhoneDao {
	public void create(Phone phone) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.save(phone);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public List<Phone> getPhones() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.createQuery("from Phone", Phone.class).list();
		}
	}
	
	public void list() {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			try {
				transaction = session.beginTransaction();
				List customers = session.createQuery("FROM Phone").list();
				for (Iterator iterator = customers.iterator(); iterator.hasNext();) {
					Phone phone = (Phone) iterator.next();
					System.out.print("Id: " + phone.getId());
					System.out.print(" Country Code: " + phone.getCountryCode());
					System.out.println(" Number: " + phone.getNumber());
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
	
	   
	public void update(long phoneId, String countryCode, String number) {

		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			try {
				transaction = session.beginTransaction();
				Phone phone = (Phone) session.get(Phone.class, phoneId);
				phone.setCountryCode(countryCode);
				phone.setNumber(number);
				session.update(phone);
				transaction.commit();
			} catch (HibernateException e) {
				if (transaction != null)
					transaction.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}
		}

	}
	   
	public void delete(long phoneId) {

		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			try {
				transaction = session.beginTransaction();
				Phone employee = (Phone) session.get(Phone.class, phoneId);
				session.delete(employee);
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
	
	public static void deleteAll() {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			try {
				transaction = session.beginTransaction();
				String stringQuery = "DELETE FROM Address";
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

