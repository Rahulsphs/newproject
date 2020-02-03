package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@RequestMapping("/")
	public Employee employeeDetail() {
		return Employee.builder()
				.name("Rahul")
				.salary(44444)
				.age(21)
				.build();
	}
}
