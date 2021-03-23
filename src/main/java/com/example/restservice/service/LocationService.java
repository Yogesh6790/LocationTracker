package com.example.restservice.service;

import com.example.restservice.entity.Coordinates;

import java.util.List;

public interface LocationService {

    List<Coordinates> getCoordinates();

}
