package com.assignmentDay12.Q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String,Student> hm=new HashMap<>();
		
		hm.put("UP",new Student(1,"rja",55));
		hm.put("bihar",new Student(2,"rahul",59));
		hm.put("delhi",new Student(3,"najju",58));
		hm.put("odisha",new Student(4,"satyajeet",78));
		hm.put("mp",new Student(5,"aman",56));
		
		Set<Map.Entry<String,Student>> set=hm.entrySet();

		List<Map.Entry<String,Student>> ls= new ArrayList(set);
		
//		Collections.sort(ls,new Studentmarks());
		Collections.sort(ls, (m1,m2)->{
			return m1.getValue().getMarks()>m2.getValue().getMarks()? 1 :  -1;
		});
		
//		System.out.println(ls);
		
		
		
		Map<String, Student> sortmp=new LinkedHashMap();
		for(Map.Entry<String, Student> x:ls) {
			sortmp.put(x.getKey(), x.getValue());
		}
		System.out.println(sortmp);
		
		
		
		
		
		
//		System.out.println("add key value pare of State name and Srtudent data");
//		while(true) {
//			System.out.println("enter state name for key");
//			String k=sc.next();
//			System.out.println("student data......");
//			System.out.println("");
//			System.out.println("enter roll");
//			int roll=sc.nextInt();
//			System.out.println("enter name");
//			String name=sc.next();
//			System.out.println("enter Marks");
//			double m=sc.nextDouble();
//			
//			Student s=new Student(roll,name,m);
//			hm.put(k, s);
//			System.out.println("want add more y/n");
//			String choice=sc.next();
//			if(choice.equalsIgnoreCase("n")) {
//				break;
//			}
//		}
		
		

	}

}
