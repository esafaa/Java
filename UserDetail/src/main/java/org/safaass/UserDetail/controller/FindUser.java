package org.safaass.UserDetail.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.safaaess.UserDetail.model.User;

import jakarta.persistence.TypedQuery;

public class FindUser {
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	
	/* Find user By Email*/
	public void findUserByEmail(String email) {
		try {
			Session session = sessionFactory.openSession();

			String str = "from User where email =:email";

			TypedQuery<User> typedQuery = session.createQuery(str, User.class);
			typedQuery.setParameter("email", email);
			User result = typedQuery.getSingleResult();

			if (result != null) {
				System.out.println(
						"The user is " + result.getName() + " " + result.getState() + " " + result.getZipCode());
			} else {
				System.out.println("No user Found");
			}

		} catch (Exception e) {
			System.out.println("No user Found");
		}

	}
	
	/* find user by ZipCode*/
	
	public void findUsersByZipCode(String zipCode) {

		Session session = sessionFactory.openSession();

		String str = "from User where zipCode= :zipCode";
		TypedQuery<User> typedQuery = session.createQuery(str, User.class);
		typedQuery.setParameter("zipCode", zipCode);
		List<User> result = typedQuery.getResultList();
		if (!result.isEmpty()) {
			for (User user : result) {
				System.out.println("The user is " + user.getName() + " " + user.getState() + " " + user.getZipCode());
			}

		} else {
			System.out.println("no user found");
		}

	}
}


