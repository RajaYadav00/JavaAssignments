package com.assignmentDay15.Q2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws Exception {
		File f=new File("d://abc.txt");
		FileReader fr=new FileReader(f);
		
		char[] chr=new char[(int)f.length()];
		
		fr.read(chr);
		
		for(char c:chr) {
			System.out.print(c);
		}

	}

}
