package com.example.springbootelasticsearchexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootelasticsearchexample.entity.Customer;
import com.example.springbootelasticsearchexample.service.CustomerService;

@RestController
@RequestMapping(value = "/cust")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping(value = "/post")
	public Customer postCustomer(@RequestBody Customer customer) {
		return customerService.postCustomer(customer);	
	}
	
	
	@GetMapping(value = "/getAll")
	public List<Customer> getAll(){
		
		return customerService.getAllCustomer();
		
	}
	
	
	

}
