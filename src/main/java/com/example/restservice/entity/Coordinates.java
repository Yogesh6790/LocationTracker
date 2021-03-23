package com.example.restservice.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "Coordinates")
public class Coordinates {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	public long getId() {
		return id;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	@Column(name = "latitude")
	@NotNull
	private double latitude;

	@Column(name = "longitude")
	@NotNull
	private double longitude;

}
