package org.safaaess.DepartmentPractice.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.safaaess.DepartmentPractice.model.Department;

public class DeleteDepartment {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Department department = new Department();
		department.setDid(1);
		session.remove(department);
		tx.commit();
		session.close();
		factory.close();
	}

}
