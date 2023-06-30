package com.example.HospitalApplication.dao;

import com.example.HospitalApplication.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusDao extends JpaRepository<Status,Integer> {
}
