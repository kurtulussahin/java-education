package com.kurtulussahin.java.personalprojects.ibtechproject.task1.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.kurtulussahin.java.personalprojects.ibtechproject.task1.model.Addres;
import com.kurtulussahin.java.personalprojects.ibtechproject.task1.util.HibernateUtil;

public class AddresDao {
	public void create(Addres addres) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.save(addres);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public List<Addres> getAddresses() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.createQuery("from Addres", Addres.class).list();
		}
	}
	
	public void listAddresses() {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			try {
				transaction = session.beginTransaction();
				List addresses = session.createQuery("FROM Addres").list();
				for (Iterator iterator = addresses.iterator(); iterator.hasNext();) {
					Addres addres = (Addres) iterator.next();
					System.out.print("Id: " + addres.getId());
					System.out.print(" Customer Id: " + addres.getCustomerId());
					System.out.print(" City: " + addres.getCity());
					System.out.println(" Country: " + addres.getCountry());
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
	   
	public void update(long addresId, String country, String city, String postalCode) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			try {
				transaction = session.beginTransaction();
				Addres addres = (Addres) session.get(Addres.class, addresId);
				addres.setCity(city);
				addres.setCountry(country);
				addres.setPostalCode(postalCode);
				session.update(addres);
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
	   
	public void delete(long addresId) {

		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			try {
				transaction = session.beginTransaction();
				Addres addres = (Addres) session.get(Addres.class, addresId);
				session.delete(addres);
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

