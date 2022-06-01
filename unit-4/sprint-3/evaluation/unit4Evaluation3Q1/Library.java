package com.unit4Evaluation3Q1;
import java.util.ArrayList;
import java.util.List;

public class Library {
	ArrayList<Book> b=new ArrayList<>();
	
	void addBook(Book book) {
		b.add(book);
	}
		boolean isEmpty() {
			return false;
			
		}

		List<Book> viewAllBooks(){
			return b;
			
		
		}
		List<Book> viewBooksByAuthor(String author ){
			ArrayList<Book> b1=new ArrayList<>();
			boolean flage=true;
			for(Book x:b) {
				if(x.author.equals(author)) {
					b1.add(x);
					flage=false;
				}
			}
			if(flage) {
				System.out.println("Non of the book are available of this offer");
			}
			return b1;
		}
	  int countNoOfBook(String bname) {
		return 0;
		
	}
}
