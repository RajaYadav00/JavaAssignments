package com.unit4Evaluation3Q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Library l = new Library();// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1 to  Add Book");

		System.out.println("2 to Display all book details");

		System.out.println("3 to Search Book by author");
		System.out.println("4 to Count number of books - by book name");

		System.out.println("5 to Exit");
		System.out.println("");
		int choice = sc.nextInt();
		if (choice == 1) {
			Book b1 = new Book();
			System.out.println("Enter the isbn");
			b1.isbn = sc.nextInt();
			System.out.println("Enter book name");
			b1.bookName = sc.next();
			System.out.println("Enter the auther name");
			String fake = sc.nextLine();
			b1.author = sc.nextLine();

			System.out.println("book added succesfully");
		} else if (choice == 2) {
			System.out.println(l.viewAllBooks());
			;
			
		} else if (choice == 3) {
			System.out.println("enter auther name");

			String name = sc.nextLine();
			l.viewBooksByAuthor(name);
		}
		else if (choice==4) {
			
		}

	}

}
