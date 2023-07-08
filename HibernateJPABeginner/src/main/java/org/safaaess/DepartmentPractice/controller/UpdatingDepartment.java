package org.safaaess.DepartmentPractice.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.safaaess.DepartmentPractice.model.Department;

public class UpdatingDepartment {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
		         Department department = new Department();
	              department.setDid(3);
			    department.setName("Main");
			    department.setState("Virginia");
			  
			    session.merge(department);
			    session.getTransaction().commit();
			    session.close();
		}
	}


