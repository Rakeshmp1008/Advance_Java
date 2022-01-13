package com.rakesh.tour;

import com.rakesh.tour.dao.SilkMFDAO;
import com.rakesh.tour.dao.SilkMFDAOimpl;
import com.rakesh.tour.entity.SilkMFEntity;

public class SilkScammer {

	public static void main(String[] args) {

		SilkMFEntity manufaturer1=new SilkMFEntity(1, "Bairappa", 200000, 35, "Haveri");
		SilkMFEntity manufaturer2=new SilkMFEntity(2, "Nagappa", 2500000, 38, "Davangere");

		SilkMFDAO dao=new SilkMFDAOimpl();
		dao.add(manufaturer1);
		dao.add(manufaturer2);
	}

}
