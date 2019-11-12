package com.dxc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dxc.demo.model.Employee;
import com.dxc.demo.repo.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository empRepo;

	@PostMapping("/employees")
	public void create(@RequestBody Employee emp) {
		empRepo.save(emp);
	}

	@GetMapping("/employees")
	public List<Employee> findAll() {
		return empRepo.findAll();
	}

	@GetMapping("/employees/{email}")
	public Employee findByEmail(@PathVariable String email) {
		return empRepo.findByEmail(email);
	}

	@GetMapping("/employees/{name}")
	public Employee findByName(@PathVariable String name) {
		return empRepo.findByName(name);
	}

}
