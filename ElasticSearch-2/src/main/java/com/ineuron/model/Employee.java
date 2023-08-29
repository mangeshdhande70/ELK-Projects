package com.ineuron.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Document(indexName = "employeeidx", createIndex = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
	
	@Id
	private Integer id;
	private String firstname;
	private String lastname;
	private int age;
	
}
