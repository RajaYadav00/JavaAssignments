package com.assignmentDay15.Q2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BuffReader {

	public static void main(String[] args) throws Exception {
		
		FileReader fr=new FileReader("d://abc.txt");
		
		BufferedReader br=new BufferedReader(fr);
         
		String line=br.readLine();
		

		while( line != null ){
			System.out.println(line);
			line=br.readLine();
		}
	}

}
