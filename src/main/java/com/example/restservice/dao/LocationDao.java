package com.example.restservice.dao;

import com.example.restservice.entity.Coordinates;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public interface LocationDao {

    List<Coordinates> getCoordinates();

}
