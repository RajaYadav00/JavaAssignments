package com.assignmentDay15.Q2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadfileNio {

	public static void main(String[] args) throws Exception {
		
		Path p=Paths.get("d://abc.txt");
		
		List<String>       list =Files.readAllLines(p);
		
		System.out.println("Reading fron the file");
		for(String s:list) {
			System.out.println(s);
		}

	}

}
