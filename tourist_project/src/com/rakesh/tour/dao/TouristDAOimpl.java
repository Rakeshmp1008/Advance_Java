package com.rakesh.tour.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.rakesh.tour.Util.EMFUtil;
import com.rakesh.tour.entity.TouristEntity;

public class TouristDAOimpl implements TouristDAO{
	
	@Override
	public void put(TouristEntity entity) {
		
		EntityManagerFactory emf=EMFUtil.getEntityManagerFactory();
		
		EntityManager manager=emf.createEntityManager();
		
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
			
	}
}
