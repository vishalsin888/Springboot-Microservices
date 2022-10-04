package com.codinguru.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codinguru.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long>{

	Department findByDepartmentId(Long id);

}
