package com.assignmentDay15.Q1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainDeserialize {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("student.txt");
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student st=null;
		try {
			st=(Student)ois.readObject();
		} catch (ClassNotFoundException | IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Student details");
		System.out.println("roll no - "+st.getRoll());
		System.out.println("name  - "+st.getName());
		System.out.println("city name - "+st.getAddress().getCity());
		System.out.println("pin code - "+st.getAddress().getPincode());
		System.out.println("email id - "+st.getEmail());
		System.out.println("password is  - "+st.getPassword());

	
	}

}
