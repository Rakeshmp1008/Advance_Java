package com.rakesh.tour.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.rakesh.tour.Util.EMFUtil;
import com.rakesh.tour.entity.SilkMFEntity;

public class SilkMFDAOimpl implements SilkMFDAO {

	@Override
	public void add(SilkMFEntity silkEntity) {

		EntityManagerFactory emf = EMFUtil.getEntityManagerFactory();

		EntityManager manager = emf.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(silkEntity);
		transaction.commit();

	}

}
