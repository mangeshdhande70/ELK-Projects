package com.example.springbootelasticsearchexample.entity;

import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "customers")
public class Customer {
	
	private Integer id;
	private String name;
	private Integer age;
	

}
