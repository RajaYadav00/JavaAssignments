package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.BookNotFound;
import com.masai.exceptions.DataNotFound;
import com.masai.model.Book;
import com.masai.repository.BookDao;
@Service
public class Bookserviceimpl  implements Bookservice{
	
	@Autowired
	BookDao bd;

	@Override
	public List<Book> getAllBook() {
		
		List<Book> listofbook=bd.findAll();
		if(listofbook.isEmpty()==true) {
			throw new DataNotFound("No Data found");
		}
		return listofbook;
	}

	@Override
	public Book getBookById(int id) {
		
//		Optional<Book> optBook=bd.findById(id);
//		Book book=optBook.get();
//		return book;
		return bd.findById(id).orElseThrow(()->new BookNotFound("book is not in the data base"));
	}

	@Override
	public Book addbook(Book b) {
		
		Book newBook=bd.save(b);
		
		return newBook;
	}

	@Override
	public Book deletebook(int id) {
		
		
		Book existbook =bd.findById(id).orElseThrow(()->new BookNotFound("book is not in the data base with id : "+id));
		      bd.deleteById(id);
		return existbook;
	}

	@Override
	public Book updatebook(Book b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book updateById(int id ,Book b) {
		Optional<Book> optBook=bd.findById(id);
		
		Book existingbook=optBook.get();
		
		
//		Book book=bd.findById(id).orElseThrow(()->new BookNotFound("this book is not in the data base"));
		
		return  bd.save(b);
	}

}
