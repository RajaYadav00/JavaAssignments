package com.assignmentDay12.Q2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class StateNameCapital {

	public static void main(String[] args) {
		
		Map<String,String> hm=new LinkedHashMap<>();
		
		hm.put("uttarpradesh", "lucknow");
		hm.put("Goa", "panji");
		hm.put("westBangal", "kolkata");
		hm.put("odisha", "bhuwneshwar");
		hm.put("bihar", "patna");
		hm.put("MP", "bopal");
		
		Set<Map.Entry<String,String>> set=hm.entrySet();
		for(Map.Entry<String,String> x:set) {
			System.out.println(x.getValue()+"--->"+x.getValue());
		}
	}

}
