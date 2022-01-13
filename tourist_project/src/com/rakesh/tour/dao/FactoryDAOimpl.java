package com.rakesh.tour.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.rakesh.tour.Util.EMFUtil;
import com.rakesh.tour.entity.FactoryEntity;

public class FactoryDAOimpl implements FactoryDAO {

	@Override
	public void add(FactoryEntity entity) {

		EntityManagerFactory emf = EMFUtil.getEntityManagerFactory();

		EntityManager manager = emf.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();
		int flushcount = 0;

		try {
			for (int i = 0; i < 5; i++) {
				manager.persist(entity);
				manager.flush();
				flushcount++;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		}

		transaction.commit();

	}

	@Override
	public void addAll(List<FactoryEntity> entities) {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		for (FactoryEntity factoryEntity : entities) {
			manager.persist(factoryEntity);

			EntityTransaction transaction = manager.getTransaction();

			transaction.begin();
			int flushcount = 0;

			try {
				for (int i = 0; i < 5; i++) {
					if (flushcount == 5) {
						manager.flush();
						flushcount = 0;
						manager.clear();
					}
					manager.flush();
					flushcount++;
				}
			} catch (PersistenceException e) {
				e.printStackTrace();
				transaction.rollback();
			}

			transaction.commit();

		}
	}
}
