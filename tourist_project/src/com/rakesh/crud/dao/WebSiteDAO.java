package com.rakesh.crud.dao;

import java.util.List;

import com.rakesh.crud.entity.WebSiteEntity;

public interface WebSiteDAO {

	public void add(WebSiteEntity entity);

	public void addAll(List<WebSiteEntity> entities);

	WebSiteEntity getByName();
	
	WebSiteEntity getByLike();
	
	WebSiteEntity getMinvalue();
	
	WebSiteEntity getMaxValue();

}
