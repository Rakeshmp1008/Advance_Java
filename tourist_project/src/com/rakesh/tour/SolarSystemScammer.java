package com.rakesh.tour;

import com.rakesh.tour.dao.SolarSystemDAOimpl;
import com.rakesh.tour.entity.SolarSystemEntity;

public class SolarSystemScammer {

	public static void main(String[] args) {

		SolarSystemEntity solarSystem=new SolarSystemEntity(1, 9, "MERCURY", 1, 3000f);
		
		SolarSystemDAOimpl dao=new SolarSystemDAOimpl();
		dao.put(solarSystem);
		
	}

}
