package com.rakesh.tour.dao;

import java.util.List;

import com.rakesh.tour.entity.FactoryEntity;


public interface FactoryDAO {

	public void add(FactoryEntity entity);
	
	public void addAll(List<FactoryEntity> entities);
}
