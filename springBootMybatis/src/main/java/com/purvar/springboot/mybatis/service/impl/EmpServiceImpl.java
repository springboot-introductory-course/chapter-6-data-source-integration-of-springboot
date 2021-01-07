package com.purvar.springboot.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purvar.springboot.mybatis.mapper.EmpMapper;
import com.purvar.springboot.mybatis.dto.Emp;
import com.purvar.springboot.mybatis.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpMapper mapper;
	
	@Override
	public Emp getEmpById(String empId) {
		return mapper.getEmpById(empId);
	}

}
