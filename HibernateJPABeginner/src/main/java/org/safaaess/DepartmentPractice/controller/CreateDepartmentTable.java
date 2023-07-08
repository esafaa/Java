package org.safaaess.DepartmentPractice.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.safaaess.DepartmentPractice.model.Department;

public class CreateDepartmentTable {

	public static void main(String[] args) {
		  SessionFactory factory = new Configuration().configure().buildSessionFactory();
	       Session session = factory.openSession();
	       Transaction t = session.beginTransaction();
	       Department department = new Department();
	       t.commit();
	       System.out.println("successfully created department table");
	       factory.close();
	       session.close();

	}

}
