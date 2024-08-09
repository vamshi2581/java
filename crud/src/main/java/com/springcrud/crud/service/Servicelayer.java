package com.springcrud.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springcrud.crud.model.Employee;
import com.springcrud.crud.repo.Repositorydemo;

public class Servicelayer {
	
	@Autowired
	private Repositorydemo repo;
	
	public List<Employee> getall()
	{
		return repo.findAll();
	}
	
	public String add()
	{
		return "working";
	}
}
