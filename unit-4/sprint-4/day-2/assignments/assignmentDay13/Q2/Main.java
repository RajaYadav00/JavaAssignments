package com.assignmentDay13.Q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
			
		List<Student> ls=new ArrayList<>();
		
		ls.add(new Student(4,"Aman",300));
		ls.add(new Student(3,"Raja",200));
		ls.add(new Student(5,"rahul",300));
		ls.add(new Student(8,"Najju",360));
		ls.add(new Student(7,"abinash",350));
		ls.add(new Student(6,"Satyajeet",400));

			Collections.sort(ls , (s1,s2)->{
				
				return s1.getMarks()>s2.getMarks()?1:-1;
				
			});
			
//			ls.removeIf(    s->s.getMarks()<250    );
			
			for(Student x:ls) {
				System.out.println("roll No"+x.getRoll());
				System.out.println("name  :"+x.getName());
				System.out.println("marks :"+x.getMarks());
				System.out.println("------------------------------");
				
			}
			
			
}

}
