package com.assignmentDay11.Q1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainLibrerySystem {

	public static void main(String[] args) {
		Set<Library> lib=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter books detail");
		while(true) {
				
			   System.out.println("enter book id");
			   double id=sc.nextDouble();
			   System.out.println("enter book name");
			   String bName=sc.next();
			   System.out.println("Ener auther name");
			   String auther=sc.next();
			   Library lb=new Library(id,bName,auther);
			   lib.add(lb);
			   System.out.println("want add more book y/n");
			   String choice=sc.next();
			   if(choice.equalsIgnoreCase("n")) {
				   break;
			   }
		}
		
		for(Library l:lib) {
			System.out.println("book id   "+l.getBookId());
			System.out.println("book name   "+l.getBookName());
			System.out.println("book Auther   "+l.getBookAuthor());
		}
	}

}
