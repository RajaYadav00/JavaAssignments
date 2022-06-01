package com.assignmentDay11.Q1;

import java.util.Objects;

public class Library {
	private double bookId;
	private String bookName;
	private String bookAuthor;
	
	public Library() {
		// TODO Auto-generated constructor stub
	}
	
	public Library(double bookId, String bookName, String bookAuthor) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}

	public double getBookId() {
		return bookId;
	}

	public void setBookId(double bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	@Override
	public int hashCode() {
		return (int) bookId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		return this.bookId==other.bookId;
	}
	
	
	
}
