package com.example.demo;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonRootName("Details of Employee:")
public class Employee{
	private String name;
	private Integer salary;
	private Integer age;

}
