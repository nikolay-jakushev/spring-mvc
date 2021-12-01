package com.yakushev.spring.mvc.dao;

import com.yakushev.spring.mvc.model.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployee();
    public void saveEmployee(Employee employee);
}
