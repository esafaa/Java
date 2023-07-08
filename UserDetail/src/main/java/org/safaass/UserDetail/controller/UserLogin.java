package org.safaass.UserDetail.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.safaaess.UserDetail.model.User;

import jakarta.persistence.TypedQuery;

public class UserLogin {

	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	public void login(String email, String password) {
		
		
		try{
		Session session = sessionFactory.openSession();

		String str = "from User where email=:email and password= :password";

		TypedQuery<User> typedQuery = session.createQuery(str, User.class);
		typedQuery.setParameter("email", email);
		typedQuery.setParameter("password", password);

		User result = typedQuery.getSingleResult();
		if (result!= null) {
			System.out.println("User: " + result.getName() + " has successfully logged in ");
		}
		}catch(Exception e) {
		
			System.out.println("No user found");
		}
	}
}
	



