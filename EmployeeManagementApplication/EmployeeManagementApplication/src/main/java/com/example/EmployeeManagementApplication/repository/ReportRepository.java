package com.example.EmployeeManagementApplication.repository;

import com.example.EmployeeManagementApplication.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository extends JpaRepository<Report,Long> {
}