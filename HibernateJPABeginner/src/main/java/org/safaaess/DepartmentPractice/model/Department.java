package org.safaaess.DepartmentPractice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DEPARTMENT")
public class Department {

	@Column(name = "DID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int did;
	public Department(String name, String state) {

		this.name = name;
		this.state = state;
	}

	public Department() {
	}
	
	private String name;
	private String state;

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
