package com.example.HospitalApplication.service;

import com.example.HospitalApplication.dao.SpecialityDao;
import com.example.HospitalApplication.model.Speciality;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpecialityService {

    @Autowired
    SpecialityDao specialityDao;

    public int saveSpeciality(Speciality specialityObj) {
        return specialityDao.save(specialityObj).getId();
    }
}