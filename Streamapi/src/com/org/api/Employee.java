package com.org.api;

public class Employee {
int id;
int age;
String name;
String gender;
int doj;
double salary;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, int age, String name, String gender, int doj, double salary) {
	super();
	this.id = id;
	this.age = age;
	this.name = name;
	this.gender = gender;
	this.doj = doj;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getDoj() {
	return doj;
}
public void setDoj(int doj) {
	this.doj = doj;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
}
