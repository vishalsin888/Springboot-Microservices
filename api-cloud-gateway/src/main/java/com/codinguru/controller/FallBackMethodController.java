package com.codinguru.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@GetMapping("/userServiceFallBack")
	public String userServiceFallBack() {
		return "User Service Is Down Please Try Again later !!!";
	}
	
	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallBack() {
		return "Department Service Is Down Please Try Again later !!!";
	}
	
}
