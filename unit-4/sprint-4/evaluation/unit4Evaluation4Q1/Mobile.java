package com.unit4Evaluation4Q1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mobile {
	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();

	public String addMobile(String company, String model) {
		
		if(mobiles.containsKey(company)) {
			ArrayList<String> list=mobiles.get(company);
			list.add(model);
			mobiles.put(company, list);
		}
		else {
					List<String> mob=new ArrayList();
					mob.add(model);
					mobiles.put(company, (ArrayList<String>) mob);
					}
		
	return "Added successfuly";
		}
		public List<String> getModels(String company)throws InvlidMobileException{
			Set<Map.Entry<String,ArrayList<String>>> m=mobiles.entrySet();
		try {
			for(Map.Entry<String,ArrayList<String>> mb:m) {
				if(mb.getKey().equalsIgnoreCase(company)) {
					return mb.getValue();
				}
				
			}
		} catch (Exception e) {
			
			throw e;
		}	
		return null;	
		}


	public static void main(String[] args) {
		

		
		Mobile mob = new Mobile();
		
		mob.addMobile("apple", "iPhone 12");
		mob.addMobile("apple", "iPhone 11");
		mob.addMobile("samsung", "Galaxy M2");
		mob.addMobile("moto", "Moto G4");
		mob.addMobile("xiomi", "note 4");
		mob.addMobile("xiomi", "note 8");
		mob.addMobile("onePlus", "note 5");
		mob.addMobile("redmi", "note 8 pro 5G");
		mob.addMobile("IQ", "iq 9");
		
		
		try {
			;
			System.out.println(mob.getModels("amrood"));
		} catch (InvlidMobileException e) {
			 
			e.printStackTrace();
		}
	}

}
