package org.safaaess.DemoRelationship.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="cohort")
public class Cohort{
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	private int cid;
	private String cName;
	private String duration;
       public Cohort() {

			}

	public Cohort( String cName, String duration) {
		this.cName = cName;
		this.duration = duration;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCName() {
		return cName;
	}
	public void setCName(String cName) {
		this.cName = cName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
}
