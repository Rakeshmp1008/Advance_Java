package com.rakesh.task.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicine_details")
public class MedicineEntity {
	@Id
	@Column(name = "m_id")
	private int id;
	@Column(name = "m_name")
	private String name;
	@Column(name = "m_expmonth")
	private String expmonth;
	@Column(name = "m_priceperstrip")
	private float pricePerStrip;

	public MedicineEntity() {

	}

	public MedicineEntity(int id, String name, String expmonth, float pricePerStrip) {
		super();
		this.id = id;
		this.name = name;
		this.expmonth = expmonth;
		this.pricePerStrip = pricePerStrip;
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

	public String getExpmonth() {
		return expmonth;
	}

	public void setExpmonth(String expmonth) {
		this.expmonth = expmonth;
	}

	public float getPricePerStrip() {
		return pricePerStrip;
	}

	public void setPricePerStrip(float pricePerStrip) {
		this.pricePerStrip = pricePerStrip;
	}

	@Override
	public String toString() {
		return "MedicineEntity [id=" + id + ", name=" + name + ", expmonth=" + expmonth + ", pricePerStrip="
				+ pricePerStrip + "]";
	}

}
