package com.rakesh.tour.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "silk_manufacturer")
public class SilkMFEntity implements Serializable{
	@Id
	@Column(name = "sm_id")
	private int id;
	@Column(name = "sm_name")
	private String name;
	@Column(name = "sm_income")
	private int income;
	@Column(name = "sm_age")
	private int age;
	@Column(name = "sm_native")
	private String location;

	public SilkMFEntity() {
	}
	
	public SilkMFEntity(int id, String name, int income, int age, String location) {
		super();
		this.id = id;
		this.name = name;
		this.income = income;
		this.age = age;
		this.location = location;
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

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "SilkMFEntity [id=" + id + ", name=" + name + ", income=" + income + ", age=" + age + ", location="
				+ location + "]";
	}
	
	
	
	

}
