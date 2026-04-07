package org.example.daugio.controller;

import org.example.daugio.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
public class EmployeeController {
    @RequestMapping(value ={"/", "/listEmployees"},method = RequestMethod.GET)
    public String listEmployees(Model model) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "hoang", "IT", 5000));        employees.add(new Employee(1, "hoang", "IT", 5000));
        employees.add(new Employee(2, "chung", "IT", 5000));
        employees.add(new Employee(3, "duong", "IT", 5000));






        model.addAttribute("employees", employees);
        return "employees-list";
    }

}
