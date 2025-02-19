package com.kurtulussahin.dependencyinjection.tightlycoupledcode;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CommerceContext {

    private final SessionFactory factory;

    public CommerceContext() {

        factory = new Configuration()
                .configure("/hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();
    }

    public Session getSession() {
        return factory.getCurrentSession();
    }

    public void close() {
        if (factory != null) {
            factory.close();
        }
    }
}
