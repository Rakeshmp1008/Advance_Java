package com.rakesh.task;

import java.util.ArrayList;
import java.util.List;

import com.rakesh.task.dao.TouristPlaceDAO;
import com.rakesh.task.dao.TouristPlaceDAOimpl;
import com.rakesh.task.entity.TouristPlaceEntity;

public class TouristPlaceScammer {

	public static void main(String[] args) {

		List<TouristPlaceEntity> list = new ArrayList<TouristPlaceEntity>();
		list.add(new TouristPlaceEntity(1, "BADAMI", 800F, "INDIA"));
		list.add(new TouristPlaceEntity(2, "AYHOLLE", 800F, "INDIA"));
		list.add(new TouristPlaceEntity(3, "NAYAGARA FALLA", 2000F, "USA"));
		list.add(new TouristPlaceEntity(4, "GOL GUMBUJ", 1000F, "INDIA"));
		list.add(new TouristPlaceEntity(5, "LONDON BRIDGE", 500F, "UK"));
		list.add(new TouristPlaceEntity(6, "TAJ MAHAL", 2000F, "INDIA"));
		list.add(new TouristPlaceEntity(7, "BARA KAMAN", 900F, "INDIA"));
		list.add(new TouristPlaceEntity(8, "IBRAHIM ROJA", 800F, "INDIA"));
		list.add(new TouristPlaceEntity(9, "KAMAL BSADI", 900, "INDIA"));
		list.add(new TouristPlaceEntity(10, "NAVEEL THEERTHA ", 2000F, "INDIA"));
		list.add(new TouristPlaceEntity(11, "Panjab", 3000F, "INDIA"));
		list.add(new TouristPlaceEntity(12, "MYSORE PALACE", 1000F, "INDIA"));
		list.add(new TouristPlaceEntity(13, "GOKAK FALLS", 1500F, "INDIA"));
		list.add(new TouristPlaceEntity(14, "JOG FALLS", 3000F, "INDIA"));
		list.add(new TouristPlaceEntity(15, "MADIKERI", 3000F, "INDIA"));
		list.add(new TouristPlaceEntity(16, "IPEL TOWER", 2000F, "FRANCE"));
		list.add(new TouristPlaceEntity(17, "TIPPU PALACE", 800F, "INDIA"));
		list.add(new TouristPlaceEntity(18, "LALBHAG", 600F, "INDIA"));
		list.add(new TouristPlaceEntity(19, "HOSPETE DAM", 800F, "INDIA"));
		list.add(new TouristPlaceEntity(20, "BANSHANKARI TEMPLE", 850F, "INDIA"));
		list.add(new TouristPlaceEntity(21, "MUKAMBIKATEMPLE", 800F, "INDIA"));
		list.add(new TouristPlaceEntity(22, "MARIKAMBA TEMPLE", 1000F, "INDIA"));
		list.add(new TouristPlaceEntity(23, "SIDDARUD MATHA", 800F, "INDIA"));
		list.add(new TouristPlaceEntity(24, "ROCK GARDEN", 1000F, "INDIA"));
		list.add(new TouristPlaceEntity(25, "MALPE BEACH", 500F, "INDIA"));
		list.add(new TouristPlaceEntity(26, "OM BEACH", 800F, "INDIA"));
		list.add(new TouristPlaceEntity(27, "COLMAR BEACH", 300F, "INDIA"));
		list.add(new TouristPlaceEntity(28, "COCO BEACH", 500F, "INDIA"));
		list.add(new TouristPlaceEntity(29, "BAGA BEACH", 400F, "INDIA"));
		list.add(new TouristPlaceEntity(30, "THANEERBHAVI BEACH", 200F, "INDIA"));
		list.add(new TouristPlaceEntity(31, "KUKKE SUBRAMANYA", 800F, "INDIA"));
		list.add(new TouristPlaceEntity(32, "DHRMASTHALA MANJUNATH", 800F, "INDIA"));
		list.add(new TouristPlaceEntity(33, "JAMKHANDI", 800F, "INDIA"));
		list.add(new TouristPlaceEntity(34, "ALPHS ", 800F, "UROPE"));
		list.add(new TouristPlaceEntity(35, "PYRAMID", 800F, "EGYPT"));
		list.add(new TouristPlaceEntity(36, "CAVES", 1000F, "INDIA"));
		list.add(new TouristPlaceEntity(37, "AGRA", 1100F, "INDIA"));
		list.add(new TouristPlaceEntity(38, "Amritsar", 1200F, "INDIA"));
		list.add(new TouristPlaceEntity(39, "Hydrabad", 800F, "INDIA"));
		list.add(new TouristPlaceEntity(40, "SURAT", 800F, "INDIA"));
		list.add(new TouristPlaceEntity(41, "KALLOLI", 1300F, "INDIA"));
		list.add(new TouristPlaceEntity(42, "BILLAI", 800F, "INDIA"));
		list.add(new TouristPlaceEntity(43, "Pune-Simha Gadh", 900F, "INDIA"));
		list.add(new TouristPlaceEntity(44, "Aurangabad-Panchakki", 800F, "INDIA"));
		list.add(new TouristPlaceEntity(45, "Ellora", 700F, "INDIA"));
		list.add(new TouristPlaceEntity(46, "Ajantha", 800F, "INDIA"));
		list.add(new TouristPlaceEntity(47, "Palani", 800F, "INDIA"));
		list.add(new TouristPlaceEntity(48, "Kanyakumari", 500F, "INDIA"));
		list.add(new TouristPlaceEntity(49, "Rameshwaram", 1650F, "INDIA"));
		list.add(new TouristPlaceEntity(50, "Gokarna", 800F, "INDIA"));
		list.add(new TouristPlaceEntity(51, "Chitradurga", 1500F, "INDIA"));
		list.add(new TouristPlaceEntity(52, "Mysore", 800F, "INDIA"));
		list.add(new TouristPlaceEntity(53, "Shimoga", 2000F, "INDIA"));
		list.add(new TouristPlaceEntity(54, "Switzerland", 4000F, "INDIA"));

		TouristPlaceDAO dao = new TouristPlaceDAOimpl();
		dao.addAll(list);

	}
}
