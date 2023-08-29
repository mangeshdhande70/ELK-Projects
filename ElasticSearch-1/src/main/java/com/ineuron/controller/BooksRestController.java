package com.ineuron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ineuron.model.Book;
import com.ineuron.service.IBookService;

@RestController
public class BooksRestController {
	
	@Autowired
	private IBookService bookService;
	
	
	@PostMapping(value = "/push")
	public Book postBook(@RequestBody Book book) {	
		return bookService.save(book);
	}
	
	
	
	@GetMapping(value = "/getALl")
	public Iterable<Book> getAllBooks() {	
		return bookService.getAllBooks();
	}

}
