package com.example.restservice.service;

import com.example.restservice.dao.LocationDao;
import com.example.restservice.entity.Coordinates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService{

    @Autowired
    private LocationDao locationDao;

    @Override
    public List<Coordinates> getCoordinates() {
        return locationDao.getCoordinates();
    }
}
