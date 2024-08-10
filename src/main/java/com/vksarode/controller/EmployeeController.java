package com.vksarode.controller;

import com.vksarode.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping(value = "/api/v1/employees")
    public List<Employee> getEmployees(){

        return List.of(new Employee("vijay"), new Employee("tarun"),
                new Employee("ravi"));
    }
}
