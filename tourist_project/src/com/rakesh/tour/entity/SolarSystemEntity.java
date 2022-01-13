package com.rakesh.tour.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="solarsystem")
public class SolarSystemEntity implements Serializable{
	@Id
	@Column(name = "s_id")
	private int id;
	@Column(name = "s_noOfPlanets")
	private int noOfPlanets;
	@Column(name = "s_nameOfPlanet")
	private String nameOfPlanet;
	@Column(name = "s_positionOfPlanet")
	private int positionOfPlanet;
	@Column(name = "s_diaOfPlanet")
	private float diaOfPlanet;

	public SolarSystemEntity() {
		
	}

	public SolarSystemEntity(int id, int noOfPlanets, String nameOfPlanet, int positionOfPlanet, float diaOfPlanet) {
		super();
		this.id = id;
		this.noOfPlanets = noOfPlanets;
		this.nameOfPlanet = nameOfPlanet;
		this.positionOfPlanet = positionOfPlanet;
		this.diaOfPlanet = diaOfPlanet;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoOfPlanets() {
		return noOfPlanets;
	}

	public void setNoOfPlanets(int noOfPlanets) {
		this.noOfPlanets = noOfPlanets;
	}

	public String getNameOfPlanet() {
		return nameOfPlanet;
	}

	public void setNameOfPlanet(String nameOfPlanet) {
		this.nameOfPlanet = nameOfPlanet;
	}

	public int getPositionOfPlanet() {
		return positionOfPlanet;
	}

	public void setPositionOfPlanet(int positionOfPlanet) {
		this.positionOfPlanet = positionOfPlanet;
	}

	public float getDiaOfPlanet() {
		return diaOfPlanet;
	}

	public void setDiaOfPlanet(float diaOfPlanet) {
		this.diaOfPlanet = diaOfPlanet;
	}

	@Override
	public String toString() {
		return "SolarSystemEntity [id=" + id + ", noOfPlanets=" + noOfPlanets + ", nameOfPlanet=" + nameOfPlanet
				+ ", positionOfPlanet=" + positionOfPlanet + ", diaOfPlanet=" + diaOfPlanet + "]";
	}
	
	
}
