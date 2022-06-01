package com.assignmentDay15.Q1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws Exception {
	
		Address ad=new Address("mau","275101");
		
		Student st=new Student(142,"raja","rajayadavce@gmail.com","8299262502",ad);
		
		FileOutputStream fos=new FileOutputStream("student.txt");
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
	     
		oos.writeObject(st);
		oos.close();
		System.out.println("st object is serailized");
		
		
	}

}
