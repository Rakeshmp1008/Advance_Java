package com.rakesh.task.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tourist_place")

public class TouristPlaceEntity {
	@Id
	@Column(name="t_id")
	private int id;
	@Column(name="t_name")
	private String name;
	@Column(name="t_sealevel")
	private float seaLevel;
	@Column(name="t_country")
	private String country;
	
	public TouristPlaceEntity() {
	}
	
	public TouristPlaceEntity(int id, String name, float seaLevel, String country) {
		super();
		this.id = id;
		this.name = name;
		this.seaLevel = seaLevel;
		this.country = country;
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

	public float getSeaLevel() {
		return seaLevel;
	}

	public void setSeaLevel(float seaLevel) {
		this.seaLevel = seaLevel;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "TouristPlaceEntity [id=" + id + ", name=" + name + ", seaLevel=" + seaLevel + ", country=" + country
				+ "]";
	}

	
	
}
