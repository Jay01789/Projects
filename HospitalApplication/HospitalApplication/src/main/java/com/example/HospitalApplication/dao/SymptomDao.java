package com.example.HospitalApplication.dao;

import com.example.HospitalApplication.model.Symptom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SymptomDao extends JpaRepository<Symptom,Integer> {
    List<Symptom> findBySymptomName(String symptomName);
}