package com.kurtulussahin.java.ibtechproject;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class AddressDAO {

    public void saveAddress(Address address) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(address);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Address getAddress(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Address.class, id);
        }
    }

    public List<Address> getAllAddresses() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Address", Address.class).list();
        }
    }

    public void updateAddress(Address address) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(address);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deleteAddress(int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Address address = session.get(Address.class, id);
            if (address != null) {
                session.delete(address);
                System.out.println("Address is deleted");
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
