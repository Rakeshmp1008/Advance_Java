package com.rakesh.tour;

import java.util.ArrayList;
import java.util.List;

import com.rakesh.tour.dao.FactoryDAO;
import com.rakesh.tour.dao.FactoryDAOimpl;
import com.rakesh.tour.entity.FactoryEntity;

public class FactoryScammer {

	public static void main(String[] args) {

		FactoryEntity factory1 = new FactoryEntity(1, "Nyamgoud Textiles", "Bagalkote", 10000, "NG", "cottonShirts");
		FactoryEntity factory2 = new FactoryEntity(2, "Nyamgoud Textiles", "Bagalkote", 10000, "NG", "cottonShirts");

		List<FactoryEntity> factoryList = new ArrayList<FactoryEntity>();
		factoryList.add(new FactoryEntity(3, "Nyamgoud Textiles", "Bagalkote", 10000, "NG", "cottonShirts"));
		factoryList.add(factory2);
		factoryList.add(new FactoryEntity(4, "Nyamgoud Textiles", "Bagalkote", 10000, "NG", "cottonShirts"));
		factoryList.add(new FactoryEntity(5, "Nyamgoud Textiles", "Bagalkote", 10000, "NG", "cottonShirts"));
		factoryList.add(new FactoryEntity(6, "Nyamgoud Textiles", "Bagalkote", 10000, "NG", "cottonShirts"));
		factoryList.add(new FactoryEntity(7, "Nyamgoud Textiles", "Bagalkote", 10000, "NG", "cottonShirts"));
		factoryList.add(new FactoryEntity(8, "Nyamgoud Textiles", "Bagalkote", 10000, "NG", "cottonShirts"));
		factoryList.add(new FactoryEntity(9, "Nyamgoud Textiles", "Bagalkote", 10000, "NG", "cottonShirts"));
		factoryList.add(new FactoryEntity(10, "Nyamgoud Textiles", "Bagalkote", 10000, "NG", "cottonShirts"));
		factoryList.add(new FactoryEntity(11, "Nyamgoud Textiles", "Bagalkote", 10000, "NG", "cottonShirts"));
		factoryList.add(new FactoryEntity(12, "Nyamgoud Textiles", "Bagalkote", 10000, "NG", "cottonShirts"));

		FactoryDAO dao = new FactoryDAOimpl();
		dao.addAll(factoryList);
	}

}
