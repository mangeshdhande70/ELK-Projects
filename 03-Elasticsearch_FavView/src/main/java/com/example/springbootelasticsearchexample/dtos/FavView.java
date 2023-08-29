package com.example.springbootelasticsearchexample.dtos;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FavView implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("customer_id")
	private Integer id;
	@JsonProperty("customer_name")
	private String name;
	
	

}
