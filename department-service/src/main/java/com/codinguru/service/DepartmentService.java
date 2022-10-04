package com.codinguru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codinguru.entity.Department;
import com.codinguru.repo.DepartmentRepo;

@Service
public class DepartmentService {

	@Autowired private DepartmentRepo departmentRepo;
	
	public Department saveDepartment(Department department) {
		return this.departmentRepo.save(department);
	}

	public Department getDepartment(Long id) {
		return this.departmentRepo.findByDepartmentId(id);
	}
	
}
