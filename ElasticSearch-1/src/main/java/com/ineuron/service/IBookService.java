package com.ineuron.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ineuron.model.Book;

@Service
public interface IBookService {

	public Iterable<Book> getAllBooks();

	public Book save(Book book);

	public void delete(Book book);

	public Book findOne(Integer id);

	public Page<Book> findByAuthor(String author, PageRequest pageRequest);

	public List<Book> findByTitle(String title);
}
