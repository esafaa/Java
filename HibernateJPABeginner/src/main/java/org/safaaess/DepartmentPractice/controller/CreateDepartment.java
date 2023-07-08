package org.safaaess.DepartmentPractice.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.safaaess.DepartmentPractice.model.Department;

public class CreateDepartment {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();
		Department departmentOne= new Department("IT","Dallas");
		Department departmentTwo= new Department("IT","New York");
		Department departmentThree= new Department("ResourceHuman","New Jersey");
		Department departmentFour= new Department("Financial","Dallas");
		Department departmentFive= new Department("Financial","New Jersey");

		session.persist(departmentOne);
		session.persist(departmentTwo);
		session.persist(departmentThree);
		session.persist(departmentFour);
		session.persist(departmentFive);

		t.commit();
		System.out.println("successfully saved");
		factory.close();
		session.close();

	}

}
