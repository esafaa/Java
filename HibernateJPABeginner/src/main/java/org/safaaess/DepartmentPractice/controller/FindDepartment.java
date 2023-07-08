package org.safaaess.DepartmentPractice.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.safaaess.DepartmentPractice.model.Department;

public class FindDepartment {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		int DID = 1;
		Department department = session.get(Department.class, DID);
		System.out.println("Department name: " + department.getName());
		System.out.println("State: " + department.getState());

		/*Close resources*/
		tx.commit();
		factory.close();
		session.close();

	}

}
