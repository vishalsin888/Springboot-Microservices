package com.codinguru.response.vo;

import com.codinguru.entity.Department;
import com.codinguru.entity.User;

import lombok.Data;

@Data
public class ResponseTemplateVO {

	private User user;
	private Department department;
	
}
