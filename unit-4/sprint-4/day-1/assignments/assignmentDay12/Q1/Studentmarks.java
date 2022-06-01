package com.assignmentDay12.Q1;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class Studentmarks implements Comparator<Map.Entry<String, Student>>{
	

	@Override
	public int compare(Entry<String, Student> o1, Entry<String, Student> o2) {
		
		   if(o1.getValue().getMarks()>o2.getValue().getMarks()) {
			   return 1;
		   }
		   else if(o1.getValue().getMarks()<o2.getValue().getMarks()) {
			   return -1;
		   }else
		 return 0;
	}

}
