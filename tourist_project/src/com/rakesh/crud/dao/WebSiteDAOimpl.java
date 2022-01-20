package com.rakesh.crud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.rakesh.crud.entity.WebSiteEntity;
import com.rakesh.tour.Util.EMFUtil;

public class WebSiteDAOimpl implements WebSiteDAO {

	@Override
	public void addAll(List<WebSiteEntity> entities) {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		manager.getTransaction().begin();

		int flushcount = 0;
		try {
			for (WebSiteEntity webSiteEntity : entities) {
				manager.persist(webSiteEntity);

				if (flushcount == 10) {
					manager.flush();
					flushcount = 0;
					manager.clear();

				}
				flushcount++;

			}
			manager.getTransaction().commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
			manager.getTransaction().rollback();
		}
	}

	@Override
	public void add(WebSiteEntity entity) {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();

		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();

	}

	@Override
	public WebSiteEntity getByName() {

		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = manager.createNamedQuery("getByName");

			Object result = query.getSingleResult();

			WebSiteEntity entity = (WebSiteEntity) result;

			return entity;

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public WebSiteEntity getByLike() {

		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getByLikeURLX");

			Object result = query.getSingleResult();
			WebSiteEntity entity = (WebSiteEntity) result;

			return entity;

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public WebSiteEntity getMinvalue() {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getMinSince");

			Object object = query.getSingleResult();
			Object[] entity = (Object[]) object;
			System.out.println(entity[0]);
			System.out.println(entity[1]);

			return (WebSiteEntity) entity[0];

		} catch (PersistenceException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public WebSiteEntity getMaxValue() {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getmaxSince");
			Object result = query.getSingleResult();
			Object[] entity = (Object[]) result;
			System.out.println(entity[0]);
			System.out.println(entity[1]);

			return (WebSiteEntity) entity[1];

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

}
