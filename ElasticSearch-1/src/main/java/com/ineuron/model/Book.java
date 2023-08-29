package com.ineuron.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(indexName = "books" )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

	@Id
	private Integer id;
	private String title;
	private String author;
	private String releaseDate;

}
