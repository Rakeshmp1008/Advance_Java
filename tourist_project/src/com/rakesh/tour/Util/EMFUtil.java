package com.rakesh.tour.Util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFUtil {

	private static EntityManagerFactory entityManagerFactory;
	
	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}
	
	static {
		System.out.println("invoking factory");
		entityManagerFactory=Persistence.createEntityManagerFactory("com.rakesh.tourist_project");
		System.out.println("init values to db");
	}
}
