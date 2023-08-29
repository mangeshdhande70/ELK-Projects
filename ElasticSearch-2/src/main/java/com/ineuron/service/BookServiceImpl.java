//package com.ineuron.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.stereotype.Service;
//
//import com.ineuron.model.Book;
//import com.ineuron.repo.BookRepo;
//
//@Service
//public class BookServiceImpl implements IBookService {
//
//	@Autowired
//	private BookRepo bookRepository;
//
//	@Override
//	public Iterable<Book> getAllBooks() {
//
//		return bookRepository.findAll();
//	}
//
//	@Override
//	public Book save(Book book) {
//		return bookRepository.save(book);
//	}
//
//	@Override
//	public void delete(Book book) {
//		bookRepository.delete(book);
//	}
//
//	@Override
//	public Book findOne(Integer id) {
//		return bookRepository.findById(id).get();
//	}
//
//	@Override
//	public Page<Book> findByAuthor(String author, PageRequest pageRequest) {
//		return bookRepository.findByAuthor(author, pageRequest);
//	}
//	
//	@Override
//	public List<Book> findByTitle(String title) {
//		return bookRepository.findByTitle(title);
//	}
//
//}
