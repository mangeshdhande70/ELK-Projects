package com.example.springbootelasticsearchexample.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootelasticsearchexample.entity.Customer;
import com.example.springbootelasticsearchexample.repo.CustomerRepo;

@Service
public class CustomerService {
	
	
	private Logger logger = LoggerFactory.getLogger(CustomerService.class);
	
	@Autowired
	private CustomerRepo customerRepo;
	
	public Customer postCustomer(Customer customer) {
		Customer customer2 = customerRepo.save(customer);
		logger.info("new customer added : {}",customer2);
		return customer2;	
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
	
	
	public Customer getCustomerById(Integer id) {
		Optional<Customer> optional = customerRepo.findById(id);
		return optional.isPresent()==true?optional.get():null;
	}
	
	
	

}
