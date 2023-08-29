package com.example.springbootelasticsearchexample.repo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.example.springbootelasticsearchexample.entity.Customer;

public interface CustomerRepo extends ElasticsearchRepository<Customer, Integer>{

}
