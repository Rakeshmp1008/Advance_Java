package com.rakesh.task.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.rakesh.task.entity.RailwayStationEntity;
import com.rakesh.tour.Util.EMFUtil;

public class RailwayStationDAOimpl implements RailwayStationDAO {

	@Override
	public void addAll(List<RailwayStationEntity> entities) {

		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		for (RailwayStationEntity railway : entities) {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();

			int flushcount = 0;
			try {
				for (int i = 0; i < 74; i++) {
					
					if (flushcount == 10) {
						manager.persist(railway);
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
