package com.kurtulussahin.java.ibtechproject;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PhoneDAO {

    public void savePhone(Phone phone) {
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

    public Phone getPhone(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Phone.class, id);
        }
    }

    public List<Phone> getAllPhones() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Phone", Phone.class).list();
        }
    }

    public void updatePhone(Phone phone) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(phone);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deletePhone(int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Phone phone = session.get(Phone.class, id);
            if (phone != null) {
                session.delete(phone);
                System.out.println("Phone is deleted");
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