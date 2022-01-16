package com.rakesh.task.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.rakesh.task.entity.TouristPlaceEntity;
import com.rakesh.tour.Util.EMFUtil;

public class TouristPlaceDAOimpl implements TouristPlaceDAO {

	@Override
	public void addAll(List<TouristPlaceEntity> entities) {

		for (TouristPlaceEntity touristPlaceEntity : entities) {
			EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
			manager.persist(touristPlaceEntity);
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();

			int flushcount = 0;
			try {
				for (int i = 0; i < 50; i++) {
					
					if (flushcount == 10) {
						manager.persist(touristPlaceEntity);
						manager.flush();
						manager.clear();
					}
					manager.clear();
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
