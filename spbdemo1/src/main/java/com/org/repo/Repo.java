package com.org.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.demo.model.Employee;

public interface Repo extends JpaRepository< Employee, Long> {

}
