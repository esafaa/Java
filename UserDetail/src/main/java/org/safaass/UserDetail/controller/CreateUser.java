package org.safaass.UserDetail.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.safaaess.UserDetail.model.User;

public class CreateUser {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		User user1= new User("safaa@gmail.com","safaa","password1","41 flower ","texas","478");
		User user2= new User("safaa2@gmail.com","safaa","password2","41 flower ","texas","478");
		User user3= new User("manish@gmail.com","manish","password3","41 flower ","texas","478");
		User user4= new User("flora@gmail.com","flora","password4","41 flower ","texas","478");

		session.persist(user1);
		session.persist(user2);
		session.persist(user3);
		session.persist(user4);
		t.commit();
		System.out.println("successfully saved");
		factory.close();
		session.close();

	}
}
