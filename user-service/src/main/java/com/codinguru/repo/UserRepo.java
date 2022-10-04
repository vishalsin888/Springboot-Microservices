package com.codinguru.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codinguru.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{

	public User findByUserId(Long id);

}
