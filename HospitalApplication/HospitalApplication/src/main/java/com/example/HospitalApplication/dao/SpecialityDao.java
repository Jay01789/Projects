package com.example.HospitalApplication.dao;

import com.example.HospitalApplication.model.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialityDao extends JpaRepository<Speciality,Integer> {

    Speciality findBySpecialityName(String speciality);
}