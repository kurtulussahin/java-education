package com.kurtulussahin.dependencyinjection.tightlycoupledcode;

import com.kurtulussahin.personalprojects.ibtechproject.student.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateProductDemo {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("/hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();
        Session session = factory.openSession();
        try {
            Product product = new Product("Laptop", 2000, "A laptop", true);
            session.beginTransaction();
            session.save(product);
            session.getTransaction().commit();
            System.out.println("Done!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            factory.close();
            session.close();
        }
    }
}
