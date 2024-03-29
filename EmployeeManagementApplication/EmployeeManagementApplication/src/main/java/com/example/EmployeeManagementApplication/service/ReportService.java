package com.example.EmployeeManagementApplication.service;

import com.example.EmployeeManagementApplication.model.Report;
import com.example.EmployeeManagementApplication.repository.ReportRepository;
import com.example.EmployeeManagementApplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ReportRepository reportRepository;
    public ResponseEntity<String> addReport(Report report) {
        Long employeeId = report.getEmployee().getId();
        report.setEmployee(employeeService.getEmployeeById(employeeId));
        reportRepository.save(report);
        return ResponseEntity.ok("Report added for employee with ID: " + employeeId + " on date: " + report.getDate());
    }
}