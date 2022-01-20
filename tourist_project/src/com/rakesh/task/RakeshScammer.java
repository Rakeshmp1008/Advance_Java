package com.rakesh.task;

import javax.persistence.EntityManager;

import com.rakesh.singleton.EMFUtil;

public class RakeshScammer {
	public static void main(String[] args) {
		
		EntityManager em=EMFUtil.getEmf().createEntityManager();
		System.out.println(em);
		
		
	}

}
