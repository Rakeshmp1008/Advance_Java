package com.rakesh.task.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.rakesh.task.entity.RailwayStationEntity;
import com.rakesh.tour.Util.EMFUtil;

public class RailwayStationDAOimpl implements RailwayStationDAO {

	@Override
	public void addAll(List<RailwayStationEntity> entities) {

		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		for (RailwayStationEntity re : entities) {
			manager.persist(re);
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();

			int flushcount = 0;
			try {
				for (int i = 0; i < 74; i++) {
					if (flushcount == 10) {
						manager.flush();
						flushcount = 0;
						manager.clear();
						
					}
					manager.flush();

				}

			} catch (PersistenceException e) {
				e.printStackTrace();
				transaction.rollback();
			}

			transaction.commit();

		}
	}

}
