package com.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ineuron.repo.EmployeeRepository")
public class ElasticSearch1Application {

	public static void main(String[] args) {
		SpringApplication.run(ElasticSearch1Application.class, args);
	}
	
	 

}
