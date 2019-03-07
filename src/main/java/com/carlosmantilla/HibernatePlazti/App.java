package com.carlosmantilla.HibernatePlazti;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.carlosmantilla.HibernatePlazti.model.Teacher;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		// Abrimos conexiòn:
		SessionFactory sessionFactory;
		Configuration configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

	}
}
