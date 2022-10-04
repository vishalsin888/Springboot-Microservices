package com.codinguru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codinguru.entity.User;
import com.codinguru.response.vo.ResponseTemplateVO;
import com.codinguru.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired private UserService userService;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		return this.userService.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long id) {
		return this.userService.findUserWithDepartment(id);
	}

}
