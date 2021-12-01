package com.yakushev.spring.mvc.controller;

import com.yakushev.spring.mvc.model.entity.Employee;
import com.yakushev.spring.mvc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class ViewController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showView(Model model) {
        List<Employee> allEmployee = employeeService.getAllEmployee();
        model.addAttribute("allEmployee", allEmployee);
        return "view";
    }
}
