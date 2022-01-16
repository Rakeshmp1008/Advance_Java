package com.rakesh.task;

import java.util.ArrayList;
import java.util.List;

import com.rakesh.task.dao.MedicineDAO;
import com.rakesh.task.dao.MedicineDAOimpl;
import com.rakesh.task.entity.MedicineEntity;

public class MedicineScammer {

	public static void main(String[] args) {

		List<MedicineEntity> medicinelist=new ArrayList<MedicineEntity>();
		
		medicinelist.add(new MedicineEntity(1,"DOLO-650","NOV",25F));
		medicinelist.add(new MedicineEntity(2,"Rybelsus","NOV",20F));
		medicinelist.add(new MedicineEntity(3,"DOLO-500","NOV",201F));
		medicinelist.add(new MedicineEntity(4,"Gilenya","DEC",35F));
		medicinelist.add(new MedicineEntity(5,"Onpattro","NOV",30F));
		medicinelist.add(new MedicineEntity(6,"Metoprolol","NOV",45F));
		medicinelist.add(new MedicineEntity(7,"Methotrexate","NOV",50F));
		medicinelist.add(new MedicineEntity(8,"Lexapro","NOV",35F));
		medicinelist.add(new MedicineEntity(9,"Loratadine","NOV",24F));
		medicinelist.add(new MedicineEntity(10,"Januvia","NOV",31F));
		medicinelist.add(new MedicineEntity(11,"Invokana","NOV",32F));
		medicinelist.add(new MedicineEntity(12,"Humira","NOV",54F));
		medicinelist.add(new MedicineEntity(13,"Farxiga","NOV",56F));
		medicinelist.add(new MedicineEntity(14,"Entresto","NOV",30F));
		medicinelist.add(new MedicineEntity(15,"Entyvio","NOV",26F));
		medicinelist.add(new MedicineEntity(16,"Doxycycline","NOV",32F));
		medicinelist.add(new MedicineEntity(17,"Cymbalta","NOV",30F));
		medicinelist.add(new MedicineEntity(18,"Cyclobenzaprine","NOV",23F));
		medicinelist.add(new MedicineEntity(19,"Clonazepam","NOV",200F));
		medicinelist.add(new MedicineEntity(20,"Clindamycin","NOV",250F));
		medicinelist.add(new MedicineEntity(21,"Citalopram","NOV",125F));
		medicinelist.add(new MedicineEntity(22,"Ciprofloxacin","NOV",225F));
		medicinelist.add(new MedicineEntity(23,"Cephalexin","NOV",65F));
		medicinelist.add(new MedicineEntity(24,"Buprenorphine","NOV",84F));
		medicinelist.add(new MedicineEntity(25,"Bunavail","MAR",82F));
		medicinelist.add(new MedicineEntity(26,"Brilinta","NOV",75F));
		medicinelist.add(new MedicineEntity(27,"Benzonatate","OCT",100F));
		medicinelist.add(new MedicineEntity(28,"Azithromycin","JUN",65F));
		medicinelist.add(new MedicineEntity(29,"Atorvastatin","JAN",35F));
		medicinelist.add(new MedicineEntity(30,"Ativan","NOV",20.06F));
		medicinelist.add(new MedicineEntity(31,"Amoxicillin","FEB",65F));
		medicinelist.add(new MedicineEntity(32,"Amlodipine","AUG",26F));
		medicinelist.add(new MedicineEntity(33,"Amitriptyline","JAN",31F));
		medicinelist.add(new MedicineEntity(34,"Adderall","NOV",45F));
		medicinelist.add(new MedicineEntity(35,"Acetaminophen","DEC",14F));
		
		MedicineDAO dao=new MedicineDAOimpl();
		dao.addAll(medicinelist);

	}

}

