package com.ineuron.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.ineuron.model.Book;


public interface BookRepo extends ElasticsearchRepository<Book, Integer> {
	
	Page<Book> findByAuthor(String author, Pageable pageable);

    List<Book> findByTitle(String title);

}
