package com.assignmentDay13.Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
	public static void printList(List<Integer> list, Predicate<Integer> predicate) {
		
		System.out.println("    ---------");
		for(Integer  i:list) {
			if(predicate.test(i))
			System.out.println(i);
			
		}
	}


	public static void main(String[] args) {
		
		List<Integer> ls=new ArrayList<>();
		ls.add(5);
		ls.add(2);
		ls.add(55);
		ls.add(53);
		ls.add(9);
		ls.add(8);
		Main.printList(ls, i->(i%2==0));
		Main.printList(ls, i->(i>9));
		Main.printList(ls, i->i>0);
	}

}
