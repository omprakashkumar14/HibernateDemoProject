package com.qc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		// Create Student object
		Student st = new Student(111, "Om Prakash", 36, "Delhi", "Male", "11223344");

		// Load Hibernate configuration
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");

		// Build SessionFactory
		SessionFactory factory = config.buildSessionFactory();

		// Open Session and perform the transaction
		Session session = null;
		Transaction tx = null;

		try {
			session = factory.openSession();
			tx = session.beginTransaction();

			// Save the student object
			session.save(st);

			// Commit the transaction
			tx.commit();

			System.out.println("Record saved successfully");
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback(); // Rollback in case of an exception
			}
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
			factory.close();
		}
	}
}
