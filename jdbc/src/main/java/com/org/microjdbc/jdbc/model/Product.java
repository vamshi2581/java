package com.org.microjdbc.jdbc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer pid;
	String name;
	String brandname;
	Integer Price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Integer pid, String name, String brandname, Integer price) {
		super();
		this.pid = pid;
		this.name = name;
		this.brandname = brandname;
		Price = price;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public Integer getPrice() {
		return Price;
	}
	public void setPrice(Integer price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", brandname=" + brandname + ", Price=" + Price + "]";
	}
	
}
