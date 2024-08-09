package com.springcrud.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Employee {

@Id
Long empid;
String name;
String design;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(Long empid, String name, String design) {
	super();
	this.empid = empid;
	this.name = name;
	this.design = design;
}
public Long getEmpId() {
	return empid;
}
public void setEmp(Long emp) {
	this.empid = emp;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesign() {
	return design;
}
public void setDesign(String design) {
	this.design = design;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", name=" + name + ", design=" + design + "]";
}
}
