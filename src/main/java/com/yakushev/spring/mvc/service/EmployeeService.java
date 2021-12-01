package com.yakushev.spring.mvc.service;

import com.yakushev.spring.mvc.model.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployee();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
