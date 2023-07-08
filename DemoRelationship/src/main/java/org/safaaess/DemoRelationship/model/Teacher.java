package org.safaaess.DemoRelationship.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Teacher implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	private String salary;
	private String teacherN;

	//@ManyToOne
	//private Department department;

	public Teacher(int tid, String salary, String teacherName) {
		super();
		this.tid = tid;
		this.salary = salary;
		teacherN = teacherName;
	}

	public Teacher() {
	}

	/*public Department getDep() {
		return department;
	}

	public void setDep(Department department) {
		this.department = department;
	}*/

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getTeacherN() {
		return teacherN;
	}

	public void setTeacherN(String teacherName) {
		teacherN = teacherName;
	}
}
