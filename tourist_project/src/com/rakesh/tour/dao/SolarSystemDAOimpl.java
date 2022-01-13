package com.rakesh.tour.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.rakesh.tour.Util.EMFUtil;
import com.rakesh.tour.entity.SolarSystemEntity;

public class SolarSystemDAOimpl implements SolarSystemDAO{

	@Override
	public void put(SolarSystemEntity solarentity) {
		EntityManagerFactory emf=EMFUtil.getEntityManagerFactory();
		
		EntityManager manager=emf.createEntityManager();
		
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(solarentity);
		
		transaction.commit();
		
		
	}

}
