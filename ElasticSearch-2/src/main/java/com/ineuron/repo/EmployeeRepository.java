package com.ineuron.repo;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.ineuron.model.Employee;



public interface EmployeeRepository extends ElasticsearchRepository<Employee, Integer>{

	List<Employee> findByFirstname(String firstName);

}