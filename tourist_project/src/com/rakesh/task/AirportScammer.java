package com.rakesh.task;


import java.util.ArrayList;
import java.util.List;

import com.rakesh.task.dao.AirPortDAO;
import com.rakesh.task.dao.AirportDAOimpl;
import com.rakesh.task.entity.AirportEntity;

public class AirportScammer {

	public static void main(String[] args) {

		AirportEntity airport1=new AirportEntity(1, "BengaluruAirport", "international", 3);
		
		List<AirportEntity> airportList =new ArrayList<AirportEntity>();
		airportList.add(airport1);
		airportList.add(new AirportEntity(2, "MangaloreAirport", "International", 2));
		airportList.add(new AirportEntity(3, "AberdeenSD	", "International", 2));
		airportList.add(new AirportEntity(4, "Abu Dhabi	", "Domestic", 2));
		airportList.add(new AirportEntity(5, "Alghero, Sardinia	", "Domestic", 2));
		airportList.add(new AirportEntity(6, "Aalesund	", "Domestic", 2));
		airportList.add(new AirportEntity(7, "Abilene, TX 	", "International", 2));
		airportList.add(new AirportEntity(8, "Great Bend, KS 	", "International", 2));
		airportList.add(new AirportEntity(9, "Great Falls, MT 	", "Domestic", 2));
		airportList.add(new AirportEntity(10, "Greenville, MS 	", "International", 2));
		airportList.add(new AirportEntity(11, "Glasgow", "International", 2));
		airportList.add(new AirportEntity(12, "Gaspe, PQ 	", "International", 2));
		airportList.add(new AirportEntity(13, "Georgetown	", "International", 2));
		airportList.add(new AirportEntity(14, "Fort Dodge, IA 	", "International", 2));
		airportList.add(new AirportEntity(15, "Farmington, NM 	", "International", 2));
		airportList.add(new AirportEntity(16, "Flint, MI 	", "Domestic", 2));
		airportList.add(new AirportEntity(17, "Hyderabad	", "International", 2));
		airportList.add(new AirportEntity(18, "International Falls, MN 	", "International", 2));
		airportList.add(new AirportEntity(19, "Iqaluit, Nunavut	", "International", 2));
		airportList.add(new AirportEntity(20, "Islamabad-Rawalpindi	", "International", 2));
		airportList.add(new AirportEntity(21, "Pittsburgh, PA 	", "International", 2));
		airportList.add(new AirportEntity(22, "Pellston, MI 	", "International", 2));
		airportList.add(new AirportEntity(23, "Peoria, IL 	", "Domestic", 2));
		airportList.add(new AirportEntity(24, "Paraburdoo, W.A.	", "International", 2));
		airportList.add(new AirportEntity(25, "Alor Setar	", "International", 2));
		airportList.add(new AirportEntity(26, "Altenrhein	", "International", 2));
		airportList.add(new AirportEntity(27, "Bacolod	", "International", 2));
		airportList.add(new AirportEntity(28, "Augusta, ME 	", "Domestic", 2));
		airportList.add(new AirportEntity(29, "Barranquilla", "International", 2));
		airportList.add(new AirportEntity(30, "Bauru", "Domestic", 2));
		airportList.add(new AirportEntity(31, "Beef Island, Tortola	", "International", 2));
		airportList.add(new AirportEntity(32, "Bangui	", "International", 2));
		airportList.add(new AirportEntity(33, "Balikpapan, Kalimantan	", "Domestic", 2));
		airportList.add(new AirportEntity(34, "MangaloreAirport", "International", 2));
		airportList.add(new AirportEntity(35, "Bastia, Corsica	", "International", 2));
		airportList.add(new AirportEntity(36, "Coffs Harbour, N.S.W.	", "International", 2));
		airportList.add(new AirportEntity(37, "Colima", "Domestic", 2));
		airportList.add(new AirportEntity(38, "College Station, TX 	", "International", 2));
		airportList.add(new AirportEntity(39, "Cologne	", "Domestic", 2));
		airportList.add(new AirportEntity(40, "Colombo", "Domestic", 2));
		airportList.add(new AirportEntity(41, "Colorado Springs, CO 	", "International", 2));
		airportList.add(new AirportEntity(42, "Columbia, MO 	", "International", 2));
		airportList.add(new AirportEntity(43, "Cork", "Domestic", 2));
		airportList.add(new AirportEntity(44, "Cubi Point Nas	", "International", 2));
		airportList.add(new AirportEntity(45, "Culiacan	", "International", 2));
		airportList.add(new AirportEntity(46, "Dawadmi	", "Domestic", 2));
		airportList.add(new AirportEntity(47, "Dayton, OH 	", "International", 2));
		airportList.add(new AirportEntity(48, "Manama	", "International", 2));
		airportList.add(new AirportEntity(49, "Mangrove Cay, Andros Island	", "International", 2));

		AirPortDAO dao=new AirportDAOimpl();
		dao.addAll(airportList);
		}

}
