package com.masai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.model.Book;


public interface Bookservice {
	
	public List<Book> getAllBook();
	public Book getBookById(int id);
	public Book addbook(Book b);
	public Book deletebook(int id);
	public Book updatebook(Book b);
	public Book updateById(int id,Book b);
	
}
