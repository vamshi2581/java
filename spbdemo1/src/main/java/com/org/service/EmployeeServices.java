package com.org.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.org.demo.model.Employee;
import com.org.repo.Repo;

@Service
public class EmployeeServices {
@Autowired
private Repo emp;

public List<Employee> getAllEmployees()
{
    return emp.findAll();
}
public Optional<Employee> getEmployeeById(Long id)
{
    return emp.findById(id);
}
public Employee saveEmployee(Employee e)
{
    return emp.save(e);
}
public Employee updateEmployee(Employee e1)
{
    return emp.save(e1);
}
public void deleteEmployee(Long id)
{
    emp.deleteById(id);
}
}