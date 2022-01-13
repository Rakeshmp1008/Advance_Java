package com.rakesh.tour.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tourist_details")

public class TouristEntity implements Serializable{

	@Id
	@Column(name = "tid")
	private int id;
	@Column(name = "t_name")
	private String name;
	@Column(name = "t_location")
	private String location;
	@Column(name = "t_sealevel")
	private float seaLevel;
	@Column(name = "t_famousfor")
	private String famousFor;
	@Column(name = "t_entryfees")
	private float entryFees;
	@Column(name = "t_season")
	private String season;

	public TouristEntity() {

	}

	public TouristEntity(int id, String name, String location, float seaLevel, String famousFor, float entryFees,
			String season) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.seaLevel = seaLevel;
		this.famousFor = famousFor;
		this.entryFees = entryFees;
		this.season = season;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getSeaLevel() {
		return seaLevel;
	}

	public void setSeaLevel(float seaLevel) {
		this.seaLevel = seaLevel;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public float getEntryFees() {
		return entryFees;
	}

	public void setEntryFees(float entryFees) {
		this.entryFees = entryFees;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	@Override
	public String toString() {
		return "TouristEntity [id=" + id + ", name=" + name + ", location=" + location + ", seaLevel=" + seaLevel
				+ ", famousFor=" + famousFor + ", entryFees=" + entryFees + ", season=" + season + "]";
	}

}
