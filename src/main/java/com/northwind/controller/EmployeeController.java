package com.northwind.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@RequestMapping("/employees")
	public List<String> getEmployees() {
		
		List<String> employees = new ArrayList<>();
		employees.add("Mark Johnson P. Pilar");
		employees.add("Zherlet Ann Formeloza");
		
		return employees;
	}
}
