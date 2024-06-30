package com.kurtulussahin.java.ibtechproject.task1.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.kurtulussahin.java.ibtechproject.task1.model.Account;
import com.kurtulussahin.java.ibtechproject.task1.util.HibernateUtil;

public class AccountDao {
	public Account create(Account account) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.save(account);
			transaction.commit();
			System.out.println("-> Creation successful. Account Id: " + account.getId());
			return account;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
			return null;
		}
	}

	public List<Account> getAccounts() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.createQuery("from Account", Account.class).list();
		}
	}
	
	public void listAccounts() {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			try {
				transaction = session.beginTransaction();
				List customers = session.createQuery("FROM Account").list();
				for (Iterator iterator = customers.iterator(); iterator.hasNext();) {
					Account account = (Account) iterator.next();
					System.out.print("Id: " + account.getId());
					System.out.print(" Customer Id: " + account.getCustomerId());
					System.out.print(" Account Name: " + account.getAccountName());
					System.out.println(" Balance: " + account.getBalance());
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
	   
	public Account update(long accountId, String accountName, long balance, int status) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			try {
				transaction = session.beginTransaction();
				Account account = (Account) session.get(Account.class, accountId);
				account.setAccountName(accountName);
				account.setBalance(balance);
				account.setStatus(status);
				session.update(account);
				transaction.commit();
				return account;
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
	   
	public void delete(long accountId) {

		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			try {
				transaction = session.beginTransaction();
				Account account = (Account) session.get(Account.class, accountId);
				session.delete(account);
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
				String stringQuery = "DELETE FROM Account";
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

