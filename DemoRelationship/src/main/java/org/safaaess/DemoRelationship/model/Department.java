package org.safaaess.DemoRelationship.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Department implements Serializable  {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY )
		private int did;
		private String dname;
		@OneToMany(targetEntity=Teacher.class, cascade = {CascadeType.ALL})
		private List teacherList;
		public Department(int did, String dname) {
			super();
			this.did = did;
			this.dname = dname;
		}
		public Department()
				{
			
				}
		public int getDid() {
			return did;
		}
		public void setDid(int did) {
			this.did = did;
		}
		public String getDname() {
			return dname;
		}
		public void setDname(String dname) {
			this.dname = dname;
		}
		
		public List getTeacherList() {
			return teacherList;
		}

		public void setTeacherList(List teacherList) {
			this.teacherList = teacherList;
		}
}

