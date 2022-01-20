package com.rakesh.task.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor

public class RakeshDTO {
	
	private String name;
	private int age;
	private String education;
	

}
