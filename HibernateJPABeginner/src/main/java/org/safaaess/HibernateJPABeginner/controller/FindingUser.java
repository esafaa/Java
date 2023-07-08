package org.safaaess.HibernateJPABeginner.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.safaaess.HibernateJPABeginner.model.User;

public class FindingUser {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		int USER_ID = 1;
		User u = session.get(User.class, USER_ID);
		System.out.println("Fullname: " + u.getFullName());
		System.out.println("Email: " + u.getEmail());
		System.out.println("password: " + u.getPassword());

		/*Close resources*/
		tx.commit();
		factory.close();
		session.close();
	}
}
