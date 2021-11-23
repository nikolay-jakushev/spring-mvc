package com.yakushev.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/employee")
public class ViewController {

    @RequestMapping("/")
    public String showView() {
        return "view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails() {
        return "askEmployeeDetailsView";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@RequestParam("employeeName") String empName, Model model) {
        empName = "Mr. " + empName;
        model.addAttribute("nameAttribute", empName);
        return "showEmployeeDetailsView";
    }

}
