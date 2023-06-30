package com.example.HospitalApplication.service;

import com.example.HospitalApplication.dao.StatusDao;
import com.example.HospitalApplication.model.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusService {

    @Autowired
    StatusDao statusDao;

    public int saveStatus(Status statusData) {
        return statusDao.save(statusData).getStatusId();
    }
}