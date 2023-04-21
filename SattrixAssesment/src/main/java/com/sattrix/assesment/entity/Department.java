package com.sattrix.assesment.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String departmentName;

   @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
   private Set<Employee> employees;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getDepartmentName() {
	return departmentName;
}

public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}

public Set<Employee> getEmployees() {
	return employees;
}

public void setEmployees(Set<Employee> employees) {
	this.employees = employees;
}

  
   
}

