package com.rakesh.task.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.rakesh.task.entity.MedicineEntity;
import com.rakesh.tour.Util.EMFUtil;

public class MedicineDAOimpl implements MedicineDAO {

	@Override
	public void addAll(List<MedicineEntity> entities) {

		for (MedicineEntity medicineEntity : entities) {
			EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
			manager.persist(medicineEntity);

			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();

			int flushcount = 0;
			try {
				for (int i = 0; i < 40; i++) {

					if (flushcount == 10) {
						manager.persist(medicineEntity);
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
