package com.example.EmployeeManagementApplication.controller;

import com.example.EmployeeManagementApplication.model.Employee;
import com.example.EmployeeManagementApplication.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/employee")
    public ResponseEntity<String> createEmployee(@RequestBody Employee employee){
        return adminService.createEmployee(employee);
    }
}