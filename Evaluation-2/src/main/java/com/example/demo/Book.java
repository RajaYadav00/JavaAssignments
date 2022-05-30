package com.example.demo;

public class Book {

	 private Integer BookId ;
	 private String name;
	 private String auther;
	  private Integer price;
	public Integer getBookId() {
		return BookId;
	}
	public String getName() {
		return name;
	}
	public String getAuther() {
		return auther;
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
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Book(Integer bookId, String name, String auther, Integer price) {
		super();
		BookId = bookId;
		this.name = name;
		this.auther = auther;
		this.price = price;
	}
	  
	  
}
