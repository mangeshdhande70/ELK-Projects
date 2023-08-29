package com.example.springbootelasticsearchexample.repo;

import com.example.springbootelasticsearchexample.entity.Product;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepo extends ElasticsearchRepository<Product, Integer> {

	List<Product> findByName(String name);
	List<Product> findByDescriptionContaining(String searchTerm);
	List<Product> findByNameContaining(String searchTerm);

}
