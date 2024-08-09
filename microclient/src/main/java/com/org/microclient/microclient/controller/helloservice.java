package com.org.microclient.microclient.controller;

public class helloservice {
private int countmax;
private int countmin;
public int getCountmax() {
	return countmax;
}
public void setCountmax(int countmax) {
	this.countmax = countmax;
}
public int getCountmin() {
	return countmin;
}
public void setCountmin(int countmin) {
	this.countmin = countmin;
}
public helloservice() {
	super();
	// TODO Auto-generated constructor stub
}
public helloservice(int countmax, int countmin) {
	super();
	this.countmax = countmax;
	this.countmin = countmin;
}
}
