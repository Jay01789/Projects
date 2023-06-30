package com.example.EmployeeManagementApplication.controller;

import com.example.EmployeeManagementApplication.model.Report;
import com.example.EmployeeManagementApplication.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;


    @PostMapping("/add")
    public ResponseEntity<String> addReport(@RequestBody Report report) {
        return reportService.addReport(report);
    }
}
