package com.rakesh.tour;

import com.rakesh.tour.dao.TouristDAOimpl;
import com.rakesh.tour.entity.TouristEntity;

public class TouristScammer {

	public static void main(String[] args) {
		TouristEntity entity=new TouristEntity(1, "MULLAYANGIRI HILLS","CHIKKAMAGALURU",6306f,"ViewPoints",00f, "Winter");
		TouristEntity entity1=new TouristEntity(2, "MULLAYANGIRI HILLS 2","CHIKKAMAGALURU 2",6307f,"ViewPoints 2",00f, "Winter 2");

		TouristDAOimpl dao=new TouristDAOimpl();
		
		dao.put(entity1);
		
	}
}
