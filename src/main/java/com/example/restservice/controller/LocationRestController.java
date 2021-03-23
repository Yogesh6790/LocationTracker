package com.example.restservice.controller;

import java.util.List;

import com.example.restservice.service.LocationService;
import com.example.restservice.entity.Coordinates;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class LocationRestController {

	@Autowired
	private LocationService locationService;

	@RequestMapping(value = "/location",
			method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Coordinates> getCoordinates() throws JsonProcessingException {
		return locationService.getCoordinates();
	}
}
