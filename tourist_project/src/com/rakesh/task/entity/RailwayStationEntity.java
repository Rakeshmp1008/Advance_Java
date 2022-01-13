package com.rakesh.task.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "railwaystation")
public class RailwayStationEntity {
	@Id
	@Column(name="r_id")
	private int id;
	@Column(name="r_name")
	private String name;
	@Column(name="r_stationCode")
	private String stationCode;
	@Column(name="r_noOfPlatforms")
	private int noOfPlatforms;

	public RailwayStationEntity() {
		
	}

	public RailwayStationEntity(int id, String name, String stationCode, int noOfPlatforms) {
		super();
		this.id = id;
		this.name = name;
		this.stationCode = stationCode;
		this.noOfPlatforms = noOfPlatforms;
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

	public String getStationCode() {
		return stationCode;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	public int getNoOfPlatforms() {
		return noOfPlatforms;
	}

	public void setNoOfPlatforms(int noOfPlatforms) {
		this.noOfPlatforms = noOfPlatforms;
	}

	@Override
	public String toString() {
		return "RailwayStationEntity [id=" + id + ", name=" + name + ", stationCode=" + stationCode + ", noOfPlatforms="
				+ noOfPlatforms + "]";
	}
	
	
}
