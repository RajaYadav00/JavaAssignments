package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private Integer BookId;
	private String name;
	private String author;
	private Integer price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(Integer bookId, String name, String author, Integer price) {
		super();
		BookId = bookId;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public Integer getBookId() {
		return BookId;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public Integer getPrice() {
		return price;
	}
	public void setBookId(Integer bookId) {
		BookId = bookId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	

}
