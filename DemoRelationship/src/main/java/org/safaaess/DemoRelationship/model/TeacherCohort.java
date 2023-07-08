package org.safaaess.DemoRelationship.model;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="TeacherCohort")
public class TeacherCohort {

		@Id
		@GeneratedValue( strategy=GenerationType.IDENTITY )
		private int tit;
		private String salary;
		private String Teachername;
		
		 @ManyToMany(targetEntity = Cohort.class)
		 private Set CohortSet;
		public TeacherCohort(String salary, String teachername, Set CohortSet) {
		this.salary = salary;
		this.Teachername = teachername;
		this.CohortSet = CohortSet;
			
		}
		public TeacherCohort() {
			
		}
		
		public Set getCohortSet() {
			return CohortSet;
		}
		public void setCohortSet(Set cohortSet) {
			CohortSet = cohortSet;
		}
		public int getTit() {
			return tit;
		}
		public void setTit(int tit) {
			this.tit = tit;
		}
		public String getSalary() {
			return salary;
		}
		public void setSalary(String salary) {
			this.salary = salary;
		}
		public String getTeachername() {
			return Teachername;
		}
		public void setTeachername(String teachername) {
			Teachername = teachername;
		}
	}
