package com.masai.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.BookNotFound;
import com.masai.exceptions.DataNotFound;
import com.masai.model.Book;
import com.masai.service.Bookservice;

@RestController
public class MyControler {
	@Autowired
	Bookservice bs;

	@GetMapping(value = "/books")
	public List<Book> getBook() {

		List<Book> bk = bs.getAllBook();

		return bk;
	}

	@GetMapping(value = "/books/{id}")
	public Book getBbyId(@PathVariable("id") Integer id) {

		Book bk = bs.getBookById(id);

		return bk;

	}

	@PutMapping(value = "/books")
	public Book creatBook(@RequestBody Book bk) {

		Book book = bs.addbook(bk);

		return book;
	}

	@DeleteMapping(value = "/books/{id}")
	public Book deletebook(@PathVariable("id") Integer id) {
       
		         Book book=bs.deletebook(id);
		         return book;
	}
	@PutMapping(value = "/book/{id}")
	public Book updateBook(@RequestBody Book b, @PathVariable Integer id) {

		Book book = bs.updateById(id,b);

		return book;
	}
}
