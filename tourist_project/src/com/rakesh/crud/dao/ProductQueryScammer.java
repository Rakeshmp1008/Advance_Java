package com.rakesh.crud.dao;

import java.util.ArrayList;
import java.util.List;

import com.rakesh.crud.entity.ProductEntity;

public class ProductQueryScammer {

	public static void main(String[] args) {

		//ProductEntity entity=new ProductEntity("Laptop", 2, "HP", 35000f, 9.5f);
		
		// List<ProductEntity> list=new ArrayList<ProductEntity>();
		
		ProductDAO dao=new ProductDAOimpl();
		//dao.getAll();
		//System.out.println(dao);
	/*	
		System.out.println(dao.getBypriceGreaterThan(1000f));
		System.out.println(dao.getBypriceGreaterThan(1000f).size());
		
		System.out.println("==========================================================");
		
		System.out.println(dao.getBypriceLesserThan(1000f));
		System.out.println(dao.getBypriceLesserThan(1000f).size());
		
		System.out.println("==============================================================");
		
		System.out.println(dao.getByNameAndId("Laptop", 81));
		
		System.out.println("===============================================================");
		
		System.out.println(dao.getTotalNames());
		System.out.println(dao.getTotalNames().size());
		
		System.out.println("===============================================================");

		System.out.println(dao.getMaxPrice());
		
		System.out.println("===============================================================");

		System.out.println(dao.getTotalPrice());

		System.out.println("===============================================================");

		System.out.println(dao.getQuantityByName("pen"));
		
		System.out.println("===============================================================");

		System.out.println(dao.getQuantityAndPriceByName("pen"));

		System.out.println("===============================================================");

		System.out.println(dao.getQuantityAndPriceByNameAndId("helmet", 93));
		
		System.out.println("===============================================================");

		System.out.println(dao.getByBrand("Jbl"));
		
		System.out.println("===============================================================");
*/
		System.out.println(dao.getBrand("buldozer"));
		
		System.out.println("===============================================================");

		System.out.println(dao.getNameAndPriceByBrand("kurlon"));
		
		System.out.println("===============================================================");

		System.out.println(dao.getNameAndPrice());
		
/*        list.add(entity);
		list.add(new ProductEntity("Mobile", 1, "Vivo", 15000f, 7.5f));
		list.add(new ProductEntity("Chair", 4, "Nilkamal", 1000f, 10f));
		list.add(new ProductEntity("TV", 1, "Sony", 15000f, 5.6f));
		list.add(new ProductEntity("Speaker", 4, "Sony", 55000f, 10f));
		list.add(new ProductEntity("EarPhone", 1, "JBL", 1500f, 6.5f));
		list.add(new ProductEntity("Charger", 2, "MI", 150f, 10f));
		list.add(new ProductEntity("Wallet", 1, "PUMA", 750f, 3.5f));
		list.add(new ProductEntity("Bag", 10, "WIKI", 2000f, 7f));
		list.add(new ProductEntity("Table", 2, "WOODEN", 8500f, 8.4f));
		list.add(new ProductEntity("Mirror", 1, "BrandLess", 200f, 9.1f));
		list.add(new ProductEntity("Cooker", 2, "Prestige", 1050f, 9.6f));
		list.add(new ProductEntity("Helmet", 4, "VEGA", 750f, 10f));
		list.add(new ProductEntity("Thermoflask", 2, "MILTON", 1200f, 3.5f));
		list.add(new ProductEntity("Curtain", 8, "SPIKER", 350f, 6.4f));
		list.add(new ProductEntity("Sofa", 3, "NILKAMAL", 5600f, 7.5f));
		list.add(new ProductEntity("Towel", 1, "KURLON", 340f,  4.5f));
		list.add(new ProductEntity("Pen", 20, "PARKER", 10f, 6.5f));
		list.add(new ProductEntity("Buldozer", 2, "JCB", 2500000f, 8.5f));
		list.add(new ProductEntity("Cables", 30, "YANCHOR", 850f, 10f));
		
		dao.addAll(list);
*/
	

		
	}

}
