package com.rakesh.task.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.rakesh.task.entity.AirportEntity;
import com.rakesh.tour.Util.EMFUtil;

public class AirportDAOimpl implements AirPortDAO {

	@Override
	public void addAll(List<AirportEntity> entities) {

		for (AirportEntity airportEntity : entities) {
			EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			int flushcount = 0;
			try {
				for (int i = 0; i < 50; i++) {
					if (flushcount == 10) {
						manager.persist(airportEntity);
						manager.flush();
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
