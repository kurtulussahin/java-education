package com.kurtulussahin.java.ibtechproject.task1.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.kurtulussahin.java.ibtechproject.task1.model.Account;
import com.kurtulussahin.java.ibtechproject.task1.model.Addres;
import com.kurtulussahin.java.ibtechproject.task1.model.Command;
import com.kurtulussahin.java.ibtechproject.task1.model.Customer;
import com.kurtulussahin.java.ibtechproject.task1.model.Phone;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();

				// Hibernate settings equivalent to hibernate.cfg.xml's properties
				Properties settings = new Properties();
				settings.put(Environment.DRIVER, "org.postgresql.Driver");
				settings.put(Environment.URL, "jdbc:postgresql://localhost:5432/postgres?useSSL=false");
				settings.put(Environment.USER, "postgres");
				settings.put(Environment.PASS, "123456");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");

				settings.put(Environment.SHOW_SQL, "true");

				settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

				settings.put(Environment.HBM2DDL_AUTO, "update");

				configuration.setProperties(settings);
				
				configuration.addAnnotatedClass(Phone.class);
				configuration.addAnnotatedClass(Account.class);
				configuration.addAnnotatedClass(Addres.class);
				configuration.addAnnotatedClass(Customer.class);
				configuration.addAnnotatedClass(Command.class);

				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();
				
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}
