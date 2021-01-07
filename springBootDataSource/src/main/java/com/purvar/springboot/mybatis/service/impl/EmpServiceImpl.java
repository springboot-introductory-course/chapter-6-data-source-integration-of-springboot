package com.purvar.springboot.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purvar.springboot.mybatis.mapper.EmpMapper;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.purvar.springboot.mybatis.dto.Emp;
import com.purvar.springboot.mybatis.service.EmpService;

@Service
@DS("master")
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpMapper mapper;
	
	@Override
	public Emp getEmpById(String empId) {
		return mapper.getEmpById(empId);
	}
	
	@Override
	@DS("test")
	public Emp getEmpById2(String empId) {
		return mapper.getEmpById(empId);
	}
}
