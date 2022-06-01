package com.unit4Evaluation4Q3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Address ad=new Address("UP","mau","275101");
		
		Employee em=new Employee(142,"Raja","raja@gmail.com","1234567",ad);
		FileOutputStream fos=new FileOutputStream("emp.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(em);
		oos.close();
		
		FileInputStream fis=new FileInputStream("emp.txt");
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		System.out.println(ois.readObject());
		System.out.println("don");
	}

}
