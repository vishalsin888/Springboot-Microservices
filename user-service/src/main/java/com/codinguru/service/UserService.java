package com.codinguru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.codinguru.entity.Department;
import com.codinguru.entity.User;
import com.codinguru.repo.UserRepo;
import com.codinguru.response.vo.ResponseTemplateVO;

@Service
public class UserService {

	@Autowired private UserRepo userRepo;
	@Autowired private RestTemplate restTemplate;
	
	public User saveUser(User user) {
		return this.userRepo.save(user);
	}

	public ResponseTemplateVO findUserWithDepartment(Long id) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		User user = this.userRepo.findByUserId(id);
		Department department = this.restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/"+user.getDepartmentId(), Department.class);
		vo.setUser(user);
		vo.setDepartment(department);
		return vo;
	}

	
}
