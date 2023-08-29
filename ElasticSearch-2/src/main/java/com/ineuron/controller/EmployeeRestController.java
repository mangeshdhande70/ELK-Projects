package com.ineuron.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ineuron.model.Employee;
import com.ineuron.repo.EmployeeRepository;

@RestController
public class EmployeeRestController {
	
	@Autowired
	private EmployeeRepository repository;
	
	@PostMapping("/saveEmployee")
	public int saveEmployee(@RequestBody List<Employee> employees) {
		System.out.println(employees.toString());
		repository.saveAll(employees);
		return employees.size();
	}

	@GetMapping("/findEverything")
	public Iterable<Employee> findAllEmployees() {
		return repository.findAll();
	}

	@GetMapping("/findByFName/{firstName}")
	public List<Employee> findByFirstName(@PathVariable String firstName) {
		return repository.findByFirstname(firstName);
	}

}
