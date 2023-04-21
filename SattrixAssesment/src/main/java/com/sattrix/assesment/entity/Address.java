package com.sattrix.assesment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String street1;
   private String street2;
   private String city;
   private String state;

   @OneToOne(mappedBy = "address")
   private Employee employee;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getStreet1() {
	return street1;
}

public void setStreet1(String street1) {
	this.street1 = street1;
}

public String getStreet2() {
	return street2;
}

public void setStreet2(String street2) {
	this.street2 = street2;
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

public Employee getEmployee() {
	return employee;
}

public void setEmployee(Employee employee) {
	this.employee = employee;
}

   
}

