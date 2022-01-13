package com.rakesh.tour.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "factory")
public class FactoryEntity {
	@Id
	@Column(name = "f_id")
	private int id;
	@Column(name = "f_name")
	private String name;
	@Column(name = "f_location")
	private String location;
	@Column(name = "f_noOfWorkers")
	private int noOfWorkers;
	@Column(name = "f_type")
	private String type;
	@Column(name = "f_brand")
	private String brand;

	public FactoryEntity() {

	}

	public FactoryEntity(int id, String name, String location, int noOfWorkers, String type, String brand) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.noOfWorkers = noOfWorkers;
		this.type = type;
		this.brand = brand;
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

	public int getNoOfWorkers() {
		return noOfWorkers;
	}

	public void setNoOfWorkers(int noOfWorkers) {
		this.noOfWorkers = noOfWorkers;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
