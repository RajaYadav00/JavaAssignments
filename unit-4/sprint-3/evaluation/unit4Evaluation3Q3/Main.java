package com.unit4Evaluation3Q3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		PlayList p=new PlayList();
		
		System.out.println("Enter 4 songs");
		for(int i=1;i<=4;i++) {
			Song s=new Song();
			System.out.println("enter movie name");
			s.movieName=sc.next();
			System.out.println("enter song name");
			s.songName=sc.next();
			p.addSongs(s);
		}
		for(Song x:p.al) {
			x.play();
			
		}
		

	}

}
