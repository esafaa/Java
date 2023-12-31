package org.safaaess.DemoRelationship.model;
import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class Address implements Serializable {
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue( strategy=GenerationType.IDENTITY )
 private int addressId;
private String street;
private String city;
private String state;
private int zipcode;
public Address() {

}
public Address(String street, String city, String state, int zipcode) {
	this.street = street;
	this.city = city;
	this.state = state;
	this.zipcode = zipcode;
}
public int getAddressId() {
	return addressId;
}
public void setAddressId(int addressId) {
	addressId = addressId;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getZipcode() {
	return zipcode;
}
public void setZipcode(int zipcode) {
	this.zipcode = zipcode;
}}
