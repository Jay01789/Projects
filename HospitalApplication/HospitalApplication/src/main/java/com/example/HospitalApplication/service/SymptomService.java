package com.example.HospitalApplication.service;

import com.example.HospitalApplication.dao.SymptomDao;
import com.example.HospitalApplication.model.Symptom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SymptomService {

    @Autowired
    SymptomDao symptomDao;

    public int addSymptom(Symptom symptom) {
        return symptomDao.save(symptom).getId();
    }
}