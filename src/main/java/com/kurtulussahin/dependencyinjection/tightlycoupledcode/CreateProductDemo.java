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

        // create session
        Session session = factory.getCurrentSession();


        try {

            System.out.println("Creating new product object...");
            Product product = new Product("Laptop", 2000, "A laptop", true);
            System.out.println("Product created: " + product);

            // start a transaction
            session.beginTransaction();

            // save the student object
            System.out.println("Saving the product...");
            session.save(product);

            // commit transaction
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
