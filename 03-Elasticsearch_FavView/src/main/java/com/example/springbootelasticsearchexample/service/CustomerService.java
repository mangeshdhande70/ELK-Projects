package com.example.springbootelasticsearchexample.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.springbootelasticsearchexample.entity.Customer;
import com.example.springbootelasticsearchexample.repo.CustomerRepo;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepo customerRepo;
	
	public Customer postCustomer(@RequestBody Customer customer) {
		return customerRepo.save(customer);	
	}
	
	public List<Customer> getAllCustomer(){
		Iterable<Customer> iterable = customerRepo.findAll();
		
		List<Customer> list = new ArrayList<>();
		
		iterable.forEach(cust->{
			list.add(cust);
		});
		
		

		List<Customer> list2 = StreamSupport.stream(iterable.spliterator(), false)
		                                   .collect(Collectors.toList());
		
		
		return list2;
	}

}
