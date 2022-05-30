package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/books")
	public  List<Book> allbook(){
		
		List<Book> ls=new ArrayList<>();
		ls.add(new Book(1,"laximikant", "luxmi",500));
		ls.add(new Book(2,"english", "lrenmartin",500));
		ls.add(new Book(3,"Math", "BC poonoia",500));
		ls.add(new Book(4,"looiut", "lHeggi",500));
		ls.add(new Book(5,"CS", "dghhg",500));
		
		return ls;
	}
	@GetMapping(value = "/book/{id}")
	public Book getBookById(@PathVariable("id") Integer id) {

		Book b1 = new Book(id, "Life jhingalala", "flep", 1111);

		return b1;

	}
	
}
