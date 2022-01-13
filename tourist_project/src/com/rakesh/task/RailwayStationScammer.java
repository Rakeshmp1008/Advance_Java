package com.rakesh.task;

import java.util.ArrayList;
import java.util.List;

import com.rakesh.task.dao.RailwayStationDAO;
import com.rakesh.task.dao.RailwayStationDAOimpl;
import com.rakesh.task.entity.RailwayStationEntity;

public class RailwayStationScammer {

	public static void main(String[] args) {

		List<RailwayStationEntity> listOfRailwayStation = new ArrayList<RailwayStationEntity>();

		listOfRailwayStation.add(new RailwayStationEntity(1, "SangolliRayyanna", "SBC", 5));
		listOfRailwayStation.add(new RailwayStationEntity(2, "AbdulKalam", "ABD", 4));
		listOfRailwayStation.add(new RailwayStationEntity(3, "Vikram Sarabhai", "CHE", 3));
		listOfRailwayStation.add(new RailwayStationEntity(4, "Abu Road", "ABR", 1));
		listOfRailwayStation.add(new RailwayStationEntity(5, "	Adavali", "ADA", 1));
		listOfRailwayStation.add(new RailwayStationEntity(6, "Jamhandi", "JMK", 1));
		listOfRailwayStation.add(new RailwayStationEntity(7, "Bidar", "BID", 1));
		listOfRailwayStation.add(new RailwayStationEntity(8, "Tumakur", "TMK", 1));
		listOfRailwayStation.add(new RailwayStationEntity(9, "Mumbai", "MUB", 1));
		listOfRailwayStation.add(new RailwayStationEntity(10, "Sangli", "SAG", 1));
		listOfRailwayStation.add(new RailwayStationEntity(11, "Athani", "ATH", 1));
		listOfRailwayStation.add(new RailwayStationEntity(12, "Kadur", "KAD", 1));
		listOfRailwayStation.add(new RailwayStationEntity(13, "Badmal", "BAD", 1));
		listOfRailwayStation.add(new RailwayStationEntity(14, "ballari", "BAL", 1));
		listOfRailwayStation.add(new RailwayStationEntity(15, "Belagavi", "BEL", 1));
		listOfRailwayStation.add(new RailwayStationEntity(16, "Bagalkot", "BGK", 1));
		listOfRailwayStation.add(new RailwayStationEntity(17, "Bijapur", "BJP", 1));
		listOfRailwayStation.add(new RailwayStationEntity(18, "Raichur", "RCH", 1));
		listOfRailwayStation.add(new RailwayStationEntity(19, "Dehli", "NWD", 1));
		listOfRailwayStation.add(new RailwayStationEntity(20, "Siradi", "SRD", 1));
		listOfRailwayStation.add(new RailwayStationEntity(21, "badami", "BDM", 1));
		listOfRailwayStation.add(new RailwayStationEntity(22, "Pattadkallu", "PTK", 1));
		listOfRailwayStation.add(new RailwayStationEntity(23, "Hassan", "HSA", 1));
		listOfRailwayStation.add(new RailwayStationEntity(24, "Mallandur", "MAL", 1));
		listOfRailwayStation.add(new RailwayStationEntity(25, "Dhavangere", "DVG", 1));
		listOfRailwayStation.add(new RailwayStationEntity(26, "Hubli", "Hub", 1));
		listOfRailwayStation.add(new RailwayStationEntity(27, "Gadag", "GDG", 1));
		listOfRailwayStation.add(new RailwayStationEntity(28, "Badkulla	", "BKD", 1));
		listOfRailwayStation.add(new RailwayStationEntity(29, "Bagaha", "BHA", 1));
		listOfRailwayStation.add(new RailwayStationEntity(30, "Bagetar	", "BET", 1));
		listOfRailwayStation.add(new RailwayStationEntity(31, "Bagevadi Road	", "BEV", 1));
		listOfRailwayStation.add(new RailwayStationEntity(32, "Baghauli", "BGH", 1));
		listOfRailwayStation.add(new RailwayStationEntity(33, "Baghdogra	", "BAG", 1));
		listOfRailwayStation.add(new RailwayStationEntity(34, "Chitgidda	", "CHITT", 1));
		listOfRailwayStation.add(new RailwayStationEntity(35, "Chittapur", "CHI", 1));
		listOfRailwayStation.add(new RailwayStationEntity(36, "Chittaranjan", "CHI", 1));
		listOfRailwayStation.add(new RailwayStationEntity(37, "Chittaurgarh	", "CHI", 1));
		listOfRailwayStation.add(new RailwayStationEntity(38, "Cuttack	", "CUT", 1));
		listOfRailwayStation.add(new RailwayStationEntity(39, "Cuddapah	", "CUD", 1));
		listOfRailwayStation.add(new RailwayStationEntity(40, "Dabhoda	", "DAB", 1));
		listOfRailwayStation.add(new RailwayStationEntity(41, "Damchara", "DAM", 1));
		listOfRailwayStation.add(new RailwayStationEntity(42, "Danapur", "DUN", 1));
		listOfRailwayStation.add(new RailwayStationEntity(43, "Danea", "DEN", 1));
		listOfRailwayStation.add(new RailwayStationEntity(44, "Dangarwa", "DAN", 1));
		listOfRailwayStation.add(new RailwayStationEntity(45, "Darliput", "DAR", 1));
		listOfRailwayStation.add(new RailwayStationEntity(46, "Dharmabad", "DHA", 1));
		listOfRailwayStation.add(new RailwayStationEntity(47, "Dhulghat", "DHU", 1));
		listOfRailwayStation.add(new RailwayStationEntity(48, "Dhulkot", "DHU", 1));
		listOfRailwayStation.add(new RailwayStationEntity(49, "Dina Nagar	", "DIN", 1));
		listOfRailwayStation.add(new RailwayStationEntity(50, "Dongargarh", "DON", 1));
		listOfRailwayStation.add(new RailwayStationEntity(51, "Durgapur", "DUR", 1));
		listOfRailwayStation.add(new RailwayStationEntity(52, "Kochi", "KOC", 1));
		listOfRailwayStation.add(new RailwayStationEntity(53, "Fatehnagar", "FAT", 1));
		listOfRailwayStation.add(new RailwayStationEntity(54, "Garividi	", "GAR", 1));
		listOfRailwayStation.add(new RailwayStationEntity(55, "Gevra Road	", "GER", 1));
		listOfRailwayStation.add(new RailwayStationEntity(56, "Dharmastala", "DHM", 1));
		listOfRailwayStation.add(new RailwayStationEntity(57, "Karwar", "KAR", 1));
		listOfRailwayStation.add(new RailwayStationEntity(58, "Birur", "BIR", 1));
		listOfRailwayStation.add(new RailwayStationEntity(59, "Arsikere", "ARS", 1));
		listOfRailwayStation.add(new RailwayStationEntity(60, "chikamagaluru", "CHI", 1));
		listOfRailwayStation.add(new RailwayStationEntity(61, "banavar", "BAN", 1));
		listOfRailwayStation.add(new RailwayStationEntity(62, "Yashwanthpur", "YAS", 1));
		listOfRailwayStation.add(new RailwayStationEntity(63, "Jamshedpur", "JAM", 1));
		listOfRailwayStation.add(new RailwayStationEntity(64, "Thalguppa", "THA", 1));
		listOfRailwayStation.add(new RailwayStationEntity(65, "Dulle", "DUL", 1));
		listOfRailwayStation.add(new RailwayStationEntity(66, "Sakaleshpur", "SAK", 1));
		listOfRailwayStation.add(new RailwayStationEntity(67, "puttur", "PUT", 1));
		listOfRailwayStation.add(new RailwayStationEntity(68, "Arjkot", "ARJ", 1));
		listOfRailwayStation.add(new RailwayStationEntity(69, "pune", "PUN", 1));
		listOfRailwayStation.add(new RailwayStationEntity(70, "salem", "SAL", 1));
		listOfRailwayStation.add(new RailwayStationEntity(71, "surat", "SUR", 1));
		listOfRailwayStation.add(new RailwayStationEntity(72, "GhandiNagar", "GHA", 1));
		listOfRailwayStation.add(new RailwayStationEntity(73, "Ajipur", "AJI", 1));
		listOfRailwayStation.add(new RailwayStationEntity(74, "Bhopal", "BHO", 1));
		listOfRailwayStation.add(new RailwayStationEntity(75, "Dharmashalla", "DHA", 1));
		listOfRailwayStation.add(new RailwayStationEntity(76, "Dasharathpur", "DAS", 1));
		RailwayStationDAO dao = new RailwayStationDAOimpl();
		dao.addAll(listOfRailwayStation);
	}

}
