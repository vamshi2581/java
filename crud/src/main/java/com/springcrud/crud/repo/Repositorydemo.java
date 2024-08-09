package com.springcrud.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcrud.crud.model.Employee;

public interface Repositorydemo extends JpaRepository<Employee, Long>{

}
