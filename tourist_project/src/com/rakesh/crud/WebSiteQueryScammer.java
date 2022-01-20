package com.rakesh.crud;

import com.rakesh.crud.dao.WebSiteDAO;
import com.rakesh.crud.dao.WebSiteDAOimpl;
import com.rakesh.crud.entity.WebSiteEntity;

public class WebSiteQueryScammer {

	public static void main(String[] args) {

		WebSiteDAO dao=new WebSiteDAOimpl();
		WebSiteEntity entity=dao.getByName();
		
		WebSiteEntity entity1=dao.getByLike();
		
		WebSiteEntity entity2=dao.getMinvalue();
		
		WebSiteEntity entity3=dao.getMaxValue();
	}

}   
