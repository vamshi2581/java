package com.example.springcloudeurekaclientdemo.springcloudeurekaclientdemo;

import java.util.ArrayList;

public class Response {
	 Integer code;
	 String message;
	 ArrayList<Product> products;
	 public Response(Integer code, String message, ArrayList<Product> products) {
			super();
			this.code = code;
			this.message = message;
			this.products = products;
		}
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Response [code=" + code + ", message=" + message + ", products=" + products + "]";
	}
	
}
