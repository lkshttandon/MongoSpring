package com.dxc.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dxc.demo.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String>{

	//Defining methods and not implementing them
	Employee findByEmail(String email);
	//To find property we use this tag : find<By><property>(type property name)
	Employee findByName(String name);//To filter by name
	
}
