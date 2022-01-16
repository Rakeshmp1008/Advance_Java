package com.rakesh.task.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airport")
public class AirportEntity {
	@Id
	@Column(name = "a_id")
	private int id;
	@Column(name = "a_name")
	private String name;
	@Column(name = "a_type")
	private String type;
	@Column(name = "a_noOfRunways")
	private int noOfRunways;

	public AirportEntity() {
	}

	public AirportEntity(int id, String name, String type, int noOfRunways) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.noOfRunways = noOfRunways;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfRunways() {
		return noOfRunways;
	}

	public void setNoOfRunways(int noOfRunways) {
		this.noOfRunways = noOfRunways;
	}

	@Override
	public String toString() {
		return "AirportEntity [id=" + id + ", name=" + name + ", type=" + type + ", noOfRunways=" + noOfRunways + "]";
	}

}
